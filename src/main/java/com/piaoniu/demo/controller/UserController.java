package com.piaoniu.demo.controller;

import com.piaoniu.demo.model.GuanzhuModel;
import com.piaoniu.demo.pojo.Like;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.service.impl.UserServiceImpl;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping(value = "user")
public class UserController {
    @Resource
    UserServiceImpl userService;
    Long begin=null;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @RequestMapping(value = "user/ticket/sell",method = RequestMethod.GET)
    @ApiOperation(value = "获取关注",notes = "获取关注")
    public Json guanzhu(Integer user_id, Integer show_status_id){
        GuanzhuModel guanzhuModel=new GuanzhuModel();
        guanzhuModel.setUser_id(user_id);
        guanzhuModel.setShow_status_id(show_status_id);
        List<GuanzhuModel> guanzhuModelList=userService.guanzhu(guanzhuModel);
        System.out.println(guanzhuModelList.size());
        String date=df.format(new Date());
        try {
            begin = df.parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (guanzhuModelList!=null){
            for (int i=0;i<guanzhuModelList.size();i++){
                try {
                    String kaishi=guanzhuModelList.get(i).getShow_begin_time();
                    Date kaishi2=df.parse(kaishi);
                    Long kaishi1=kaishi2.getTime();
                    if (kaishi1<=begin){
                        int show_id=guanzhuModelList.get(i).getShow_id();
                        userService.xiugaizhuangtai(show_id);

                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            return Status.getStatus(0,userService.guanzhu(guanzhuModel));
        }else {
            return Status.getStatus(1,"无东西");
        }
    }

    @RequestMapping(value = "user/out/focus",method = RequestMethod.GET)
    @ApiOperation(value = "取消关注",notes = "取消关注")
    public Json quxiaoguanzhu(Integer user_id, Integer like_id){
        List<GuanzhuModel> guanzhuModelList=userService.guanzhuList(user_id);
        System.out.println(guanzhuModelList.size());
        if (guanzhuModelList!=null){
            for (int i=0;i<guanzhuModelList.size();i++){
                int like_id2=guanzhuModelList.get(i).getLike_id();
                if (like_id==like_id2){
                    userService.quxiaoguanzhu(like_id);
                    int show_id=guanzhuModelList.get(i).getShow_id();
                    int show_attention=(guanzhuModelList.get(i).getShow_attention())-1;
                    GuanzhuModel guanzhuModel=new GuanzhuModel();
                    guanzhuModel.setShow_id(show_id);
                    guanzhuModel.setShow_attention(show_attention);
                    System.out.println(show_attention);
                    userService.xiugaiguanzhuliang(guanzhuModel);
                }
            }
            return Status.getStatus(0);
        }else {
            return Status.getStatus(1);
        }
    }

    //新增关注
    @RequestMapping(value = "user/add/concern",method = RequestMethod.GET)
    @ApiOperation(value = "新增关注",notes="新增关注")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json tianjiaguanzhu(Integer user_id, Integer show_id) {
        Like like = new Like();
        like.setUser_id(user_id);
        like.setShow_id(show_id);
        int show_attention = 0;
        List<Like> likes=userService.likeList(like);  //通过user_id和show_id查询关注表数据，用于判断是否已经关注
        List<GuanzhuModel> guanzhuModelList = userService.guanzhuList(user_id); //获取某个用户所有的关注和信息
        List<Show> guanzhuliang=userService.guanzhuliang(show_id);//获取关注量是多少
        show_attention=(guanzhuliang.get(0).getShow_attention())+1;
        GuanzhuModel guanzhuModel=new GuanzhuModel();
        guanzhuModel.setShow_id(show_id);
        guanzhuModel.setShow_attention(show_attention);
        if (guanzhuModelList.size()<1) {
            userService.tianjiaguanzhu(like);
            userService.xiugaiguanzhuliang(guanzhuModel);
            return Status.getStatus(0);
        } else {
            if (likes.size() >= 1) {
                return Status.getStatus(1, "已经关注过了");
            } else {
                userService.tianjiaguanzhu(like);
                userService.xiugaiguanzhuliang(guanzhuModel);
                return Status.getStatus(0);
            }
        }
    }

}
package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.service.IndexService;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "index")
public class IndexController {
    @Autowired
    IndexService indexService;
    @RequestMapping(value = "selectShowType",method  = RequestMethod.GET)
    @ApiOperation(value = "遍历演出类型",notes="遍历演出类型")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser() {
        if(indexService.findShowtype()!=null){
            return Status.getStatus(0,indexService.findShowtype());
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "selectShowByAll",method = RequestMethod.GET)
    @ApiOperation(value = "根据大量条件遍历演出",notes="根据大量条件遍历演出")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser1(@ModelAttribute Show show) {
        if(indexService.findShowByAll(show)!=null){
            return Status.getStatus(0,indexService.findShowByAll(show));
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "selectShowByCityAndHot",method = RequestMethod.GET)
    @ApiOperation(value = "根据城市id查询并按关注量排序",notes="根据城市id和关注量查询演出")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser2(@ModelAttribute Show show) {
        if(indexService.findByCityAndHot(show)!=null){
            return Status.getStatus(0,indexService.findByCityAndHot(show));
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "selectShowByCityAndGrade",method = RequestMethod.GET)
    @ApiOperation(value = "根据城市id查询并按折扣排序",notes="根据城市id查询并按折扣排序")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser3(@ModelAttribute Show show) {
        if(indexService.findByCityAndGrade(show)!=null){
            return Status.getStatus(0,indexService.findByCityAndGrade(show));
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "selectHotCity",method = RequestMethod.GET)
    @ApiOperation(value = "查询热门城市",notes="查询热门城市")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser4() {
        if(indexService.findHotCity()!=null){
            return Status.getStatus(0,indexService.findHotCity());
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "selectCity",method = RequestMethod.GET)
    @ApiOperation(value = "查询城市",notes="查询城市")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser5() {
        if(indexService.findCity()!=null){
            return Status.getStatus(0,indexService.findCity());
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "selectphoto",method = RequestMethod.GET)
    @ApiOperation(value = "查询轮播图",notes="查询轮播图")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser6() {
        if(indexService.findPhoto()!=null){
            return Status.getStatus(0,indexService.findPhoto());
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "SelectBySome",method = RequestMethod.GET)
    @ApiOperation(value = "模糊查询",notes="模糊查询")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser7(String message) {
        if(indexService.findShowBySome(message).size()>0){
            return Status.getStatus(0,indexService.findShowBySome(message));
        }else {
            return Status.getStatus(0,"未找到相关演出");
        }
    }

}


package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.City;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.service.IndexService;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

public class IndexController {
    @Autowired
    IndexService indexService;

    @GetMapping("/")
    public String index(Model model,Integer city_id){
        if(city_id==null){
            city_id=1;
            this.Select(city_id,model);
        }
        this.getUser(model);
        this.getUser4(model);
        this.getUser5(model);
        return "index";
    }
    @GetMapping("/faxian")
    public String faxian(){
        return "discover";
    }
    @GetMapping("/allShow")
    public String allShow(){
        return "action";
    }
    @GetMapping("/commentTwo")
    public String commentTwo(){
        return "new_html";
    }

    @RequestMapping(value = "/SelectByCity",method = RequestMethod.GET)
    private String Select( int city_id,Model model){
        Show show=new Show();
        show.setCity_id(city_id);
        System.out.println(city_id);
        model.addAttribute("hot",indexService.findByCityAndHot(show));
        model.addAttribute("garde",indexService.findByCityAndGrade(show));
        Show show1=new Show();
        show1.setCity_id(city_id);
        show1.setShow_type_id(1);
        model.addAttribute("music",indexService.findShowByAll(show1));
        Show show9=new Show();
        show9.setCity_id(city_id);
        show9.setShow_type_id(2);
        model.addAttribute("child",indexService.findShowByAll(show1));
        Show show2=new Show();
        show2.setCity_id(city_id);
        show2.setShow_type_id(3);
        model.addAttribute("huajv",indexService.findShowByAll(show2));
        Show show3=new Show();
        show3.setCity_id(city_id);
        show3.setShow_type_id(4);
        model.addAttribute("xiuxian",indexService.findShowByAll(show3));
        Show show4=new Show();
        show4.setCity_id(city_id);
        show4.setShow_type_id(5);
        model.addAttribute("pe",indexService.findShowByAll(show4));
        Show show6=new Show();
        show6.setCity_id(city_id);
        show6.setShow_type_id(6);
        model.addAttribute("yinyue",indexService.findShowByAll(show6));
        Show show7=new Show();
        show7.setCity_id(city_id);
        show7.setShow_type_id(7);
        model.addAttribute("dance",indexService.findShowByAll(show7));
        Show show8=new Show();
        show8.setCity_id(city_id);
        show8.setShow_type_id(8);
        model.addAttribute("xiqu",indexService.findShowByAll(show8));
        model.addAttribute("cname",indexService.findCityName(city_id));
        model.addAttribute("message1",indexService.findShowtype());
        model.addAttribute("message2",indexService.findHotCity());
        model.addAttribute("city",indexService.findCity());
        String[] zimu={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        List<String> resultList = new ArrayList<>(zimu.length);
        for (String s : zimu) {
            resultList.add(s);
        }
        model.addAttribute("model",resultList);
        return "index";
    }
    @RequestMapping(value = "selectShowType",method  = RequestMethod.GET)
    @ApiOperation(value = "遍历演出类型",notes="遍历演出类型")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public void getUser(Model model) {
            model.addAttribute("message1",indexService.findShowtype());
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
    public void getUser4(Model model) {
            model.addAttribute("message2",indexService.findHotCity());
    }
    @RequestMapping(value = "selectCity",method = RequestMethod.GET)
    @ApiOperation(value = "查询城市",notes="查询城市")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public void getUser5(Model model) {
            model.addAttribute("city",indexService.findCity());

    }
    @RequestMapping(value = "selectphoto",method = RequestMethod.GET)
    @ApiOperation(value = "查询轮播图",notes="查询轮播图")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public void getUser6(Model model) {

            model.addAttribute("lunbo",indexService.findPhoto());
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


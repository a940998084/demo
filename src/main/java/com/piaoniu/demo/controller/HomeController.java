package com.piaoniu.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 页面跳转控制
 */
@Controller
@Api(value = "页面跳转控制",tags = "页面跳转控制接口")
public class HomeController {
    @RequestMapping({"/","/index"})
    public String index(){
        return "Htindex";
    }
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String login(){
        return "Htlogin";
    }
    @RequestMapping(value = "/403",method = RequestMethod.GET)
    public String error(){
        return "403";
    }
}

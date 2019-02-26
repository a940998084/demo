package com.piaoniu.demo.controller;

import com.piaoniu.demo.service.LoginService;
import com.piaoniu.demo.util.Json;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "手机登录",tags = {"登录功能接口"})
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    //获取验证码
    @RequestMapping(value = "/getCode",method = RequestMethod.GET)
    @ApiOperation(value = "获取验证码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user_phone",value = "手机号码",dataType = "String"),
    })
    public Json getCode(String user_phone){

        boolean falg=loginService.getCode(user_phone);
        Json json=new Json();
        int a=0;
        if (!falg){
            a=1;
            json.setMessage("验证码获取失败");
        }
        json.setStatus(a);
        return json;
    }

    //匹配验证码
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "用户登陆/注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user_phone",value = "手机号码",dataType = "String"),
            @ApiImplicitParam(name = "code",value = "验证码",dataType = "String")
    })
    public Json proof(String user_phone, String code){
        Json json=loginService.proof(user_phone,code);
        if (json.getStatus()==0){
            loginService.proofUser(user_phone);
        }
        return json;
    }
}

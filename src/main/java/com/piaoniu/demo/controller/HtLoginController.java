package com.piaoniu.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@Api(value = "后台登录控制",tags = "后台登录接口")
public class LoginController {

    private Logger logger=LoggerFactory.getLogger(LoginController.class);
    /**
     * 登录
     * @return
     */
    @ApiOperation(value = "后台登录验证",notes ="后台登录验证")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userLogin(HttpServletRequest request, Model model)throws Exception{
        logger.info("执行登录！");
        // 登录失败从request中获取shiro处理的异常信息。
        // shiroLoginFailure:就是shiro异常类的全类名.
        String exception=(String)request.getAttribute("shiroLoginFailure");
        String message="";
        if (exception!=null){
            if (UnknownAccountException.class.getName().equals(exception)){
                message="账号不存在";
            }else if(IncorrectCredentialsException.class.getName().equals(exception)){
                message="密码不正确";
            }
        }
        model.addAttribute("message",message);
        return "/login";
    }
}

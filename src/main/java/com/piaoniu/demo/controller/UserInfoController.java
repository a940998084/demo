package com.piaoniu.demo.controller;

import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("userInfo")
@Api(value = "超级管理员功能",tags = "超级管理员功能接口")
public class UserInfoController {
    /**
     * 用户查询
     * @return
     */
    @RequestMapping(value = "/userList",method = RequestMethod.GET)
    @RequiresPermissions("userInfo:view")
    public String userInfo(){
        return "userInfo";
    }

    /**
     * 用户添加
     * @return
     */
    @RequestMapping(value = "/userAdd",method = RequestMethod.GET)
    @RequiresPermissions("userInfo:add")
    public String userInfoAdd(){
        return "userInfoAdd";
    }

    /**
     * 用户修改
     * @return
     */
    @RequestMapping(value = "userUpdate",method = RequestMethod.GET)
    @RequiresPermissions("userInfo:update")
    public String userInfoUpdate(){
        return "userInfoUpdate";
    }
}

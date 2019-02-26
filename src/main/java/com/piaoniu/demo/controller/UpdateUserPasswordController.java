package com.piaoniu.demo.controller;

import com.piaoniu.demo.service.impl.UpdateUserPasswordServiceImpl;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UpdateUserPasswordController {
    @Resource
    UpdateUserPasswordServiceImpl updateUserPasswordService;

    @RequestMapping(value = "SelectShowtimeByShowname",method = RequestMethod.POST)
    @ApiOperation(value = "修改密码",notes="修改密码")
    public Json updatePw(Integer user_id,String user_password,String user_newPassword,String user_newPassword1){
        updateUserPasswordService.upUserPw1(user_id,user_password,user_newPassword,user_newPassword1);
        return Status.getStatus(0);
    }
}

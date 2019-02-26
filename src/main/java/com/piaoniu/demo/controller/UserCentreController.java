package com.piaoniu.demo.controller;

import com.piaoniu.demo.service.impl.UserCentreServiceImpl;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
public class UserCentreController {
    @Resource
    UserCentreServiceImpl userCentreService;

    @RequestMapping(value = "user/centre/update",method = RequestMethod.POST)
    @ApiOperation(value = "个人信息",notes="个人信息")
    public Json couponList(MultipartFile files, Integer user_id, String user_username, String user_signature) {
        userCentreService.insetpath(files,user_id,user_username,user_signature);
        return Status.getStatus(0);
     }
}

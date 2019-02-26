package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.User;
import com.piaoniu.demo.service.impl.UserMoneyServiceImpl;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserMoneyController {
    @Resource
    UserMoneyServiceImpl userMoneyService;

    @RequestMapping(value = "user/money/select",method = RequestMethod.GET)
    @ApiOperation(value = "查询余额",notes = "查询余额")
    public Json selectUserMoney(Integer user_id){
        List<User> userMoneyList=userMoneyService.selectUserMoney(user_id);
        if (userMoneyList!=null){
            return Status.getStatus(0,userMoneyList);
        }else{
            return Status.getStatus(1);
        }

    }


}

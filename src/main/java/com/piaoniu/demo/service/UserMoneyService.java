package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.User;

import java.util.List;

public interface UserMoneyService {

    //通过user_id查询用户的余额
    List<User> selectUserMoney(Integer user_id);
}

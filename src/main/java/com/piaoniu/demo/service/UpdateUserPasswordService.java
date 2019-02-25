package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.User;

import java.util.List;

public interface UpdateUserPasswordService {

    //通过用户id查询用户的密码
    String selectPw(Integer user_id);

    //通过用户id修改密码
    int upUserPw (User user);

    void upUserPw1 (Integer user_id,String user_password,String user_newPassword,String user_newPassword1);
}

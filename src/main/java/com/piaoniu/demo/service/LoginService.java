package com.piaoniu.demo.service;

import com.piaoniu.demo.model.LoginModel;
import com.piaoniu.demo.model.LoginUserInfo;
import com.piaoniu.demo.util.Json;

public interface LoginService {
    //获取验证码
    boolean getCode(String user_phone);

    //校对
    Json proof(String user_phone, String code);

    //注册或者登录
    void proofUser(String user_phone);

    //获取用户信息
    LoginUserInfo loginUserInfo(int user_id, LoginModel loginModel);

    //注册操作
    void addUser(int user_id);
}

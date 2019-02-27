package com.piaoniu.demo.dao;

import com.piaoniu.demo.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdateUserPasswordDao {

    //通过用户id查询用户的密码
    String selectPw(Integer user_id);

    //通过用户id修改密码
    int upUserPw (User user);


}

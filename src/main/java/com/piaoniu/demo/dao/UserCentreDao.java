package com.piaoniu.demo.dao;

import com.piaoniu.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserCentreDao {

    //根据用户id查询相关信息
    List<User> selectUserCentre(Integer user_id);

    //根据用户id修改个人信息
    int updateUserCentre(User user);
}

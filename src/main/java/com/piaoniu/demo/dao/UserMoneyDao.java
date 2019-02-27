package com.piaoniu.demo.dao;

import com.piaoniu.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMoneyDao {

    //通过user_id查询用户的余额
    List<User> selectUserMoney(Integer user_id);
}

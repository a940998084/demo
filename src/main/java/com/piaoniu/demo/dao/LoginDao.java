package com.piaoniu.demo.dao;

import com.piaoniu.demo.model.LoginModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginDao {

    //查询是否存在
    int findUser(@Param("user_phone") String user_phone);

    //注册
    int userAdd(@Param("user_phone") String user_phone);

    //获取用户完整信息
    LoginModel findPass(@Param("user_phone") String user_phone);

    //获取用户购物车个数
    int findShop(@Param("user_id") int uid);

    //获取用户优惠券个数
    int findTick(@Param("user_id") int user_id);

    //获取用户余额
    Double findBal(@Param("user_id") int user_id);

    //注册之后添加余额表
    int userBalAdd(@Param("user_id") int user_id);

    //注册之后添加优惠券
    int userTickAdd(@Param("user_id") int user_id);
}

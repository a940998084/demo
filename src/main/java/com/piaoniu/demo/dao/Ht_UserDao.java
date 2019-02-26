package com.piaoniu.demo.dao;

import com.piaoniu.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Ht_UserDao {
    /**
     * 查看所有用户信息
     * @return
     */
    @Select("select user_id,user_username,user_phone,user_signature,user_head_photo from pn_user")
    List<User> findAllUserInfo();


}

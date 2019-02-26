package com.piaoniu.demo.dao;

import com.piaoniu.demo.pojo.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SysUserDao {
    /**
     * 通过账号查询用户
     * @param username
     * @return
     */
    @Select("select * from sys_user where username=#{0}")
    SysUser findByUserName(String username);

    /**
     * 添加用户
     * @param sysUser
     * @return
     */
    @Insert("insert into sys_user (username,password) values (#{username},#{passsword})")
    int add(SysUser sysUser);

    /**
     * 删除用户
     * @param uid
     * @return
     */
    int delete(int uid);
}

package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.SysUser;

public interface SysUserService {
    /**
     * 通过账号查询用户
     * @param username
     * @return
     */
    SysUser findByUserName(String username);
    /**
     * 添加用户
     * @param sysUser
     * @return
     */
    int add(SysUser sysUser);
    /**
     * 删除用户
     * @param uid
     * @return
     */
    int delete(int uid);
}

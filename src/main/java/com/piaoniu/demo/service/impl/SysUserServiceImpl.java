package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.SysUserDao;
import com.piaoniu.demo.pojo.SysUser;
import com.piaoniu.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDao sysuserDao;

    @Override
    public SysUser findByUserName(String username) {
        return sysuserDao.findByUserName(username);
    }

    @Override
    public int add(SysUser sysUser) {
        return sysuserDao.add(sysUser);
    }

    @Override
    public int delete(int uid) {
        return sysuserDao.delete(uid);
    }
}

package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.Ht_UserDao;
import com.piaoniu.demo.pojo.User;
import com.piaoniu.demo.service.HtUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HtUserServiceImpl implements HtUserService {

    @Resource
    private Ht_UserDao userDao;

    @Override
    public List<User> findAllUserInfo() {
        return userDao.findAllUserInfo();
    }
}

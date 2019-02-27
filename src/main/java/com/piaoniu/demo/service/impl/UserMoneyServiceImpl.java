package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.UserMoneyDao;
import com.piaoniu.demo.pojo.User;
import com.piaoniu.demo.service.UserMoneyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserMoneyServiceImpl implements UserMoneyService {
    @Resource
    UserMoneyDao userMoneyDao;

    @Override
    public List<User> selectUserMoney(Integer user_id) {
        return userMoneyDao.selectUserMoney(user_id);
    }
}

package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.AdminDao;
import com.piaoniu.demo.pojo.ShowType;
import com.piaoniu.demo.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {


    @Resource
    private AdminDao adminDao;
    @Override
    public int addshowType(ShowType showType) {
        return adminDao.addshowType(showType);
    }

    @Override
    public List<ShowType> select() {
        return adminDao.select();
    }

    @Override
    public int updateshowType(ShowType showType) {
        return adminDao.updateshowType(showType);
    }

    @Override
    public int delshowType(ShowType showType) {
        return adminDao.delshowType(showType);
    }
}

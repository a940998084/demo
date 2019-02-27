package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.UserDao;
import com.piaoniu.demo.model.GuanzhuModel;
import com.piaoniu.demo.pojo.Like;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


    @Override
    public List<GuanzhuModel> guanzhu(GuanzhuModel guanzhuModel) {
        return userDao.guanzhu(guanzhuModel);
    }

    @Override
    public int xiugaizhuangtai(Integer show_id) {
        return userDao.xiugaizhuangtai(show_id);
    }

    @Override
    public int quxiaoguanzhu(Integer like_id) {
        return userDao.quxiaoguanzhu(like_id);
    }

    @Override
    public List<GuanzhuModel> guanzhuList(Integer user_id) {
        return userDao.guanzhuList(user_id);
    }

    @Override
    public int xiugaiguanzhuliang(GuanzhuModel model) {
        return userDao.xiugaiguanzhuliang(model);
    }

    @Override
    public int tianjiaguanzhu(Like like) {
        return userDao.tianjiaguanzhu(like);
    }

    @Override
    public List<Like> likeList(Like like) {
        return userDao.likeList(like);
    }

    @Override
    public List<Show> guanzhuliang(Integer show_id) {
        return userDao.guanzhuliang(show_id);
    }

}

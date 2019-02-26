package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.VerySceneDao;
import com.piaoniu.demo.pojo.VeryScene;
import com.piaoniu.demo.service.VerySceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class VerySceneServiceImpl implements VerySceneService {
    @Resource
    VerySceneDao verySceneDao;

    @Override
    public List<VeryScene> selectVeryScene() {
        return verySceneDao.selectVeryScene();
    }
}

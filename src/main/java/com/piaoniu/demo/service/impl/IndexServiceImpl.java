package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.IndexDao;
import com.piaoniu.demo.model.IndexModel;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.pojo.ShowType;
import com.piaoniu.demo.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    IndexDao indexDao;

    @Override
    public List<ShowType> findShowtype() {
        return indexDao.findShowtype();
    }

    @Override
    public List<IndexModel> findShowByAll(Show show) {
        return indexDao.findShowByAll(show);
    }

    @Override
    public List<IndexModel> findByCityAndHot(Show show) {
        return indexDao.findByCityAndHot(show);
    }

    @Override
    public List<IndexModel> findByCityAndGrade(Show show) {
        return indexDao.findByCityAndGrade(show);
    }
}

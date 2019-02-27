package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.AdCityDao;
import com.piaoniu.demo.pojo.City;
import com.piaoniu.demo.pojo.Hall;
import com.piaoniu.demo.pojo.ShowPlace;
import com.piaoniu.demo.service.AdCityService;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdCityServiceImpl implements AdCityService {
    @Resource
    private AdCityDao adCityDao;

    @Override
    public List<City> selectcity() {
        return adCityDao.selectcity();
    }

    @Override
    public int insertcity(City city) {
        return adCityDao.insertcity(city);
    }

    @Override
    public int delcity(City city) {
        return adCityDao.delcity(city);
    }

    @Override
    public List<ShowPlace> selectbycity(Integer city_id) {
        return adCityDao.selectbycity(city_id);
    }

    @Override
    public int insertshowplace(ShowPlace showPlace) {
        return adCityDao.insertshowplace(showPlace);
    }

    @Override
    public int delshowplace(ShowPlace showPlace) {
        return adCityDao.delshowplace(showPlace);
    }

    @Override
    public List<Hall> selecthall(Integer hall_id) {
        return adCityDao.selecthall(hall_id);
    }

    @Override
    public int inserthall(Hall hall) {
        return adCityDao.inserthall(hall);
    }

    @Override
    public int updatehall(Hall hall) {
        return adCityDao.updatehall(hall);
    }

    @Override
    public int delhall(Hall hall) {
        return adCityDao.delhall(hall);
    }
}

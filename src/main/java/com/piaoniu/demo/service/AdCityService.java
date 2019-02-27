package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.City;
import com.piaoniu.demo.pojo.Hall;
import com.piaoniu.demo.pojo.ShowPlace;
import io.swagger.models.auth.In;

import java.util.List;

public interface AdCityService {
    List<City> selectcity();  //查看全部城市
    int insertcity(City city); //添加城市
    int delcity(City city);    //删除城市

    List<ShowPlace> selectbycity(Integer city_id);
    int insertshowplace(ShowPlace showPlace);
    int delshowplace(ShowPlace showPlace);


    List<Hall> selecthall(Integer hall_id);
    int inserthall(Hall hall);
    int updatehall(Hall hall);
    int delhall(Hall hall);
}

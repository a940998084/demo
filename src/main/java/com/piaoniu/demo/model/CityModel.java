package com.piaoniu.demo.model;

import com.piaoniu.demo.pojo.City;

import java.util.List;

public class CityModel {
    //首字母
    private String init;
    //城市
    private List<City> city;

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public List<City> getCity() {
        return city;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }
}

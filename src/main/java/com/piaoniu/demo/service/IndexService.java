package com.piaoniu.demo.service;

import com.piaoniu.demo.model.CityModel;
import com.piaoniu.demo.model.IndexModel;
import com.piaoniu.demo.pojo.City;
import com.piaoniu.demo.pojo.Photo;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.pojo.ShowType;

import java.util.List;

public interface IndexService {
    List<ShowType> findShowtype();
    List<IndexModel> findShowByAll(Show show);
    List<IndexModel> findByCityAndHot(Show show);
    List<IndexModel> findByCityAndGrade(Show show);
    List<CityModel> findCity();
    List<City> findHotCity();
    List<Photo> findPhoto();
    List<IndexModel> findShowBySome(String message);
}

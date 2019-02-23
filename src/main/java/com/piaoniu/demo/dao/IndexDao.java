package com.piaoniu.demo.dao;

import com.piaoniu.demo.model.CityModel;
import com.piaoniu.demo.model.IndexModel;
import com.piaoniu.demo.pojo.City;
import com.piaoniu.demo.pojo.Photo;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.pojo.ShowType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IndexDao {
    List<ShowType> findShowtype();
    List<IndexModel> findShowByAll(Show show);
    List<IndexModel> findByCityAndHot(Show show);
    List<IndexModel> findByCityAndGrade(Show show);
    List<City> findCity();
    List<City> findHotCity();
    List<Photo> findPhoto();
    List<IndexModel> findShowBySome(String message);
}

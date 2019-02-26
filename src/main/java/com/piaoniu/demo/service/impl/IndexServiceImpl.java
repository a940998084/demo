package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.IndexDao;
import com.piaoniu.demo.model.CityModel;
import com.piaoniu.demo.model.IndexModel;
import com.piaoniu.demo.pojo.City;
import com.piaoniu.demo.pojo.Photo;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.pojo.ShowType;
import com.piaoniu.demo.service.IndexService;
import com.piaoniu.demo.util.PinYin;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    @Override
    public List<CityModel> findCity() {
        List<City> cities=indexDao.findCity();
        //结果
        List<CityModel> cityNums=new ArrayList<>();
        //所有首字母
        List<String> inits=new ArrayList<>();
        PinYin py=new PinYin();

        for (int i=0;i<cities.size();i++){
            CityModel cityModel=new CityModel();
            City city=cities.get(i);
            String num=null;
            try {
                num= py.toPinYin(city.getCity_name());
            } catch (BadHanyuPinyinOutputFormatCombination badHanyuPinyinOutputFormatCombination) {
                badHanyuPinyinOutputFormatCombination.printStackTrace();
            }
            String n= String.valueOf(num.charAt(0));
            if (inits.contains(n)){
                int size = inits.indexOf(n);
                cityModel=cityNums.get(size);
                List<City> list=cityModel.getCity();
                list.add(city);
                cityModel.setCity(list);
            }else {
                inits.add(n);
                cityModel.setInit(n);

                List<City> list1=new ArrayList<>();
                list1.add(city);

                cityModel.setCity(list1);
               //list.add(city);
               //cityModel.setCity(list);
                cityNums.add(cityModel);
            }
        }

        return cityNums;
    }

    @Override
    public List<City> findHotCity() {
        return indexDao.findHotCity();
    }

    @Override
    public List<Photo> findPhoto() {
        return indexDao.findPhoto();
    }

    @Override
    public List<IndexModel> findShowBySome(String message) {
        return indexDao.findShowBySome(message);
    }
}

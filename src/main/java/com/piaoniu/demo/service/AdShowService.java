package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.Show;

import java.util.List;

public interface AdShowService {
    List<Show> selectshow();
    int insertshow(Show show);
    int updateshow(Show show);
    int delshow(Show show);
}

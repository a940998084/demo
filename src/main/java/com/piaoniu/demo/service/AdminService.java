package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.ShowType;

import java.util.List;

public interface AdminService {
    int addshowType(ShowType showType);
    List<ShowType> select();
    int updateshowType(ShowType showType);
    int delshowType(ShowType showType);
}

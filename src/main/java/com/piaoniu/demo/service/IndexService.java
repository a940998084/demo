package com.piaoniu.demo.service;

import com.piaoniu.demo.model.IndexModel;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.pojo.ShowType;

import java.util.List;

public interface IndexService {
    List<ShowType> findShowtype();
    List<IndexModel> findShowByAll(Show show);
}

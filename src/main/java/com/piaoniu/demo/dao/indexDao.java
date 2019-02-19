package com.piaoniu.demo.dao;

import com.piaoniu.demo.pojo.ShowType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface indexDao {
    List<ShowType> findShowtype();
}

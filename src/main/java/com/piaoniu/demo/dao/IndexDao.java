package com.piaoniu.demo.dao;

import com.piaoniu.demo.model.IndexModel;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.pojo.ShowType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IndexDao {
    List<ShowType> findShowtype();
    List<IndexModel> findShowByAll(Show show);
}

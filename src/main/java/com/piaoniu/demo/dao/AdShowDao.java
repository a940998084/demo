package com.piaoniu.demo.dao;

import com.piaoniu.demo.pojo.Show;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdShowDao {

    List<Show> selectshow();  //查看全部演出信息
    int insertshow(Show show); //添加演出
    int updateshow(Show show); //修改演出信息
    int delshow(Show show);    //删除演出

}

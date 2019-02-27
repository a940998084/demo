package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.Seat;

import java.util.List;

public interface AdSeatService {
    int insertseat(Seat seat);  //添加座位信息
    List<Seat> selectseat(Integer hall_id);    //查看座位
    int updateseat(Seat seat); //修改座位
    int delseat(Seat seat);  //删除座位
}

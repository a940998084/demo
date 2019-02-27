package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.AdSeatDao;
import com.piaoniu.demo.pojo.Seat;
import com.piaoniu.demo.service.AdSeatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AdSeatServiceImpl implements AdSeatService {
    @Resource
    private AdSeatDao adSeatDao;
    @Override
    public int insertseat(Seat seat) {
        return adSeatDao.insertseat(seat);
    }

    @Override
    public List<Seat> selectseat(Integer hall_id) {
        return adSeatDao.selectseat(hall_id);
    }

    @Override
    public int updateseat(Seat seat) {
        return adSeatDao.updateseat(seat);
    }

    @Override
    public int delseat(Seat seat) {
        return adSeatDao.delseat(seat);
    }
}

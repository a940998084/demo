package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.Ht_OrderDao;
import com.piaoniu.demo.pojo.Order;
import com.piaoniu.demo.service.HtOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HtOrderServiceImpl implements HtOrderService {

    @Resource
    private Ht_OrderDao HtOrderDao;

    @Override
    public List<Order> SelectOrderInfoByCondition(Order order) {
        return HtOrderDao.SelectOrderInfoByCondition(order);
    }

    @Override
    public List<Order> findAllOrderInfo() {
        return HtOrderDao.findAllOrderInfo();
    }
}

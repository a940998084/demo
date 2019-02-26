package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.Order;

import java.util.List;

public interface HtOrderService {
    List<Order> SelectOrderInfoByCondition(Order order);
    List<Order> findAllOrderInfo();
}

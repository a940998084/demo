package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.OrderDao;
import com.piaoniu.demo.model.Order2;
import com.piaoniu.demo.pojo.Address;
import com.piaoniu.demo.pojo.Discount;
import com.piaoniu.demo.pojo.Order;

import com.piaoniu.demo.model.Order1;
import com.piaoniu.demo.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;


    @Override
    public List<Order1> selectByUserAndStatus(Order1 order1) {
        return orderDao.selectByUserAndStatus(order1);
    }



    @Override
    public List<Order1> selectAll(Order1 order1) {
        return orderDao.selectAll(order1);
    }

    @Override
    public int updateStatus(Order1 order1) {
        return orderDao.updateStatus(order1);
    }

    @Override
    public List<Order2> selectOrderDetail(Order2 order2) {
        return orderDao.selectOrderDetail(order2);
    }

    @Override
    public List<Address> selectAddress(Address address) {
        return orderDao.selectAddress(address);
    }


    @Override
    public int add(Order order) {
        return orderDao.add(order);
    }

    @Override
    public List<Discount> selectDiscount(Discount discount) {
        return orderDao.selectDiscount(discount);
    }


}

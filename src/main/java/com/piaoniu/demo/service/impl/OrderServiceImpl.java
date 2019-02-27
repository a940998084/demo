package com.piaoniu.demo.service.impl;

import com.alipay.api.AlipayApiException;
import com.piaoniu.demo.config.AlipayUtil;
import com.piaoniu.demo.dao.OrderDao;
import com.piaoniu.demo.model.AlipayBean;
import com.piaoniu.demo.model.Order2;
import com.piaoniu.demo.pojo.Address;
import com.piaoniu.demo.pojo.Discount;
import com.piaoniu.demo.pojo.Order;

import com.piaoniu.demo.model.Order1;
import com.piaoniu.demo.pojo.Pnlog;
import com.piaoniu.demo.service.OrderService;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

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
    public int add(Order order) {
        return orderDao.add(order);
    }


    @Override
    public List<Address> selectAddress(Address address) {
        return orderDao.selectAddress(address);
    }

    @Override
    public int insetlog(Pnlog pnlog) {
        return orderDao.insetlog(pnlog);
    }

    @Override
    public List<Pnlog> selectLog() {
        return orderDao.selectLog();
    }

    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        return AlipayUtil.connect(alipayBean) ;
    }



    @Override
    public List<Discount> selectDiscount(Discount discount) {
        return orderDao.selectDiscount(discount);
    }

    @Override
    public List<Order2> selectOrderDetail(Order2 order2) {
        return orderDao.selectOrderDetail(order2);
    }


}

package com.piaoniu.demo.service;

import com.alipay.api.AlipayApiException;
import com.piaoniu.demo.model.AlipayBean;
import com.piaoniu.demo.model.Order2;
import com.piaoniu.demo.pojo.Address;
import com.piaoniu.demo.pojo.Discount;
import com.piaoniu.demo.pojo.Order;
import com.piaoniu.demo.model.Order1;
import com.piaoniu.demo.pojo.Pnlog;
import sun.rmi.runtime.Log;

import java.util.List;

public interface OrderService {

    /**
     * 根据订单的状态遍历订单
     * 待支付 1    待出票  2   待收货 3
     * 已完成 4   已取消 5   已退款  6
     */
    List<Order1> selectByUserAndStatus(Order1 order1);



    /**
     *
     * 遍历所有的订单
     */
    List<Order1> selectAll(Order1 order1) ;

    /**
     * 取消订单(修改订单额状态)
     */
    int updateStatus(Order1 order1);



    /**
     *s生成订单
     */
    int add(Order order);

    /**
     * 查询用户所看演出是不是有对应的优惠券
     */
    List<Discount> selectDiscount(Discount discount);

    /**
     * 订单详情
     */
    List<Order2>  selectOrderDetail(Order2 order2);
/**
 * 遍历用户的收货地址
 */
List<Address> selectAddress(Address address);

/*生成日志*/
    int insetlog(Pnlog pnlog) ;
    /*查看日志*/
    List<Pnlog>  selectLog();


    String aliPay(AlipayBean alipayBean) throws AlipayApiException;
}

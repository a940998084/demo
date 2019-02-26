package com.piaoniu.demo.dao;

import com.piaoniu.demo.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;
@Mapper
public interface Ht_OrderDao {
    /**
     * 通过各种条件查询订单信息
     * @param order
     * @return
     */
    List<Order> SelectOrderInfoByCondition(Order order);

    /**
     * 查询全部信息
     * @return
     */
    @Select("select * from pn_order")
    List<Order> findAllOrderInfo();
    /**
     * 查询今天订单
     */
    @Select("select * from pn_order where to_days(order_time)<=to_days(now())")
    List<Order> findAllToday();
    /**
     * 查询昨天订单
     */
    @Select("select * from pn_order where to_days(now())-to_days(order_time)<=1")
    List<Order> findAllYesterday();
    /**
     * 查询近7天订单
     */
    @Select("select * from pn_order where date_sub(CURDATE(),interval 7 day)<=date(order_time)")
    List<Order> findAllWeek();
    /**
     * 查询近30天订单
     */
    @Select("select * from pn_order where date_sub(CURDATE(),interval 30 day)<=date(order_time)")
    List<Order> findAllMouth();
    /**
     * 查询上个月订单
     */
    @Select("select * from pn_order where PERIOD_DIFF(DATA_FORMAT(NOW(),'%Y%m'),DATE_FORMAT(order_time,'%Y%m'))=1")
    List<Order> findAllLastMouth();
    /**
     * 查询本季度订单
     */
    @Select("select * from pn_order where QUARTER(order_time)=QUARTER(now())")
    List<Order> findAllThirdMouth();
    /**
     * 查询本年订单
     */
    @Select("select * from pn_order where YEAR(order_time)=YEAR(NOW())")
    List<Order> findAllThisYear();
    /**
     * 查询去年订单
     */
    @Select("select * from pn_order where YEAR(order_time)=YEAR(date_sub(now(),interval 1 year))")
    List<Order> findAllLastYear();
    /**
     * 查询距离当前现在6个月的订单
     */
    @Select("select * from pn_order where order_time between date_sub(now(),interval 6 mouth) and now()")
    List<Order> findAllSixthMouth();
    /**
     * 查询当前月份的订单
     */
    @Select("select * from pn_order where DATE_FORMAT(order_time,'%Y%m')=DATE_FORMAT(CURDATE(),'%Y%m')")
    List<Order> findAllThisMouth();
    /**
     * 查询指定时间段的数据
     */
    @Select("select * from pn_order where order_time between #{startTime} and #{endTime}")
    List<Order> findAllByTime(Date startTime,Date endTime);

}

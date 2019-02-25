package com.piaoniu.demo.controller;

import com.google.gson.Gson;
import com.piaoniu.demo.pojo.Address;
import com.piaoniu.demo.pojo.Discount;
import com.piaoniu.demo.pojo.Order;
import com.piaoniu.demo.model.Order1;
import com.piaoniu.demo.service.OrderService;
import io.swagger.annotations.Api;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Api("订单接口")
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Resource
    private RedisTemplate<String,String> redisTemplate;
    @Resource
    private OrderService orderService;


   //根据订单的状态去查询各种类型的订单
    @RequestMapping(value = "/selectByUserAndStatus", method = RequestMethod.GET)
    public List<Order1> selectByUserAndStatus(Order1 order1) {
       return orderService.selectByUserAndStatus(order1);
    }
        //遍历该用户的所有的订单
    @RequestMapping(value = "/selectAll", method = RequestMethod.POST)
    public List<Order1> sleect(Order1 order1) {
        return orderService.selectAll(order1);
    }

    //取消订单
    @RequestMapping(value = "/updateStatus", method = RequestMethod.POST)
    public int upd(Order1 order1) {
        return orderService.updateStatus(order1);
    }

    //查询该用户的优惠券
    @RequestMapping(value = "/selectOrderDetail", method = RequestMethod.POST)
    public List<Discount> selectDiscount(Discount discount){

        return orderService.selectDiscount(discount);
    }




    //生成订单
  @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int add (Order order, HttpSession session) {

        //设置订单编号
        String temp_str = "";
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        temp_str = simpleDateFormat.format(date);
        String a = temp_str.replace("-", "");
        String b=a.replace(":","");
        String c=b.replace(" ","");
        String d=UUID.randomUUID().toString().substring(0, 5);
        String e=c+d;
        order.setOrder_number(e);


        //获取当前的用户id
   //    order.setUser_id((Integer) session.getAttribute("user_id"));

        order.setOrder_status_id(1);

       //判断用户是不是有优惠券
  //  Discount discount=new Discount();
  //  List<Discount> list=orderService.selectDiscount(discount);
  //  //订单总金额  票价*数量
  //  if (list.size()>0){
  //    //*  double money =(double)session.getAttribute("show_money")*order.getOrder_amount()-discount.getDiscount_money();*//*
  //    double money=order.getOrder_money()-discount.getDiscount_money();
  //    order.setOrder_money(money);
  //  }else {
  //    order.setOrder_money(order.getOrder_money());
  //  }



      redisTemplate.opsForValue().set("key", String.valueOf(order),15,TimeUnit.MINUTES);



      return orderService.add(order);


        //获取当前的配送方式id
      /*  if (order.getSave_way_id()==2){  //自取
                orderService.add(order);
        }else{
            //遍历该用户的地址
            Address address=new Address();
            List <Address> A=orderService.selectAddress(address);
            return String.valueOf(A);
        }*/








        }
//遍历用户的收货地址
    @RequestMapping(value = "/selectAddress", method = RequestMethod.POST )
    public List<Address> selectAddress(Address address){
        return  orderService.selectAddress(address);
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String TEST(){
        redisTemplate.opsForValue().set("key","路杰",5,TimeUnit.SECONDS);
        return "存入redis" ;
    }


    @RequestMapping(value = "/test1", method = RequestMethod.POST)
    public String TEST1(){
        return redisTemplate.opsForValue().get("key");
    }
}
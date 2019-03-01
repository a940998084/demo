package com.piaoniu.demo.controller;

import com.alipay.api.AlipayApiException;
import com.google.gson.Gson;
import com.piaoniu.demo.model.AlipayBean;
import com.piaoniu.demo.model.Order2;
import com.piaoniu.demo.pojo.*;
import com.piaoniu.demo.model.Order1;
import com.piaoniu.demo.service.OrderService;
import io.swagger.annotations.Api;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping(value = "alipay")
    public String alipay (AlipayBean alipayBean) throws AlipayApiException{
        return orderService.aliPay(alipayBean);
    }


   //根据订单的状态去查询各种类型的订单
    @RequestMapping(value = "/selectByUserAndStatus", method = RequestMethod.GET)
    public List<Order1> selectByUserAndStatus(Order1 order1,HttpSession httpSession) {
        User user=(User)httpSession.getAttribute("User");
        int user_id=user.getUser_id();
        order1.setUser_id(user_id);
       return orderService.selectByUserAndStatus(order1);
    }
        //遍历该用户的所有的订单
    @RequestMapping(value = "/selectAll", method = RequestMethod.POST)
    public List<Order1> sleect(Order1 order1,HttpSession httpSession) {
        User user=(User)httpSession.getAttribute("User");
        int user_id=user.getUser_id();
        order1.setUser_id(user_id);
        return orderService.selectAll(order1);
    }

    //取消订单
    @RequestMapping(value = "/updateStatus", method = RequestMethod.POST)
    public int upd(Order1 order1) {
        return orderService.updateStatus(order1);
    }

    //查询该用户的优惠券
    @RequestMapping(value = "/selectDiscount", method = RequestMethod.POST)
    public List<Discount> selectDiscount(Discount discount,HttpSession httpSession){
        User user=(User)httpSession.getAttribute("User");
        int user_id=user.getUser_id();
        discount.setUser_id(user_id);
        return orderService.selectDiscount(discount);
    }

    // 查询订单详情
    @RequestMapping(value = "/selectOrderDetail", method = RequestMethod.POST)
    public List<Order2> selectOrderDetail(Order2 order2 ){
       return orderService.selectOrderDetail(order2);
    }

    //日志的查看
    @RequestMapping(value = "/selectLog", method = RequestMethod.POST)
    public List<Pnlog> selectLog(){
        return orderService.selectLog();
    }

    //生成订单
  @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int  add (Order order, HttpSession httpSession) {

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

        User user=(User)httpSession.getAttribute("User");
        int user_id=user.getUser_id();
        order.setUser_id(user_id);

        Pnlog pnlog=new Pnlog();
        pnlog.setLog_message("订单以及提交,等待支付");
        pnlog.setOrder_number(e);
        orderService.insetlog(pnlog);
        if (orderService.add(order)>1){
            return 1;
        }
        return 0;


        //获取当前的用户id
   //    order.setUser_id((Integer) session.getAttribute("user_id"));



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


/*
      redisTemplate.opsForValue().set("key", String.valueOf(order),15,TimeUnit.MINUTES);*/






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

    @RequestMapping(value = "/insetlog", method = RequestMethod.POST )
    public int insetlog (Pnlog pnlog){
        pnlog.setLog_message("订单已经提交等待支付");
    return orderService.insetlog(pnlog);
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

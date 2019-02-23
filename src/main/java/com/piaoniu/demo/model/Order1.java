package com.piaoniu.demo.model;

import java.util.Date;

public class Order1 {
    private int Order_status_id;  //状态id
    private int user_id;  //用户id
    private String begin_show_time;   //演出时间
    private Date order_time;         //下单时间
    private String show_name;   //演出名称
    private String show_picture; //演出图
    private String show_place;  //演出地点
    private double order_money;      //订单总金额
    private String order_number;     //订单编号
    private int order_amount;  //订单数量
    private String order_sts; //支付的状态


    public int getOrder_status_id() {
        return Order_status_id;
    }

    public void setOrder_status_id(int order_status_id) {
        Order_status_id = order_status_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getBegin_show_time() {
        return begin_show_time;
    }

    public void setBegin_show_time(String begin_show_time) {
        this.begin_show_time = begin_show_time;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public String getShow_name() {
        return show_name;
    }

    public void setShow_name(String show_name) {
        this.show_name = show_name;
    }

    public String getShow_picture() {
        return show_picture;
    }

    public void setShow_picture(String show_picture) {
        this.show_picture = show_picture;
    }

    public String getShow_place() {
        return show_place;
    }

    public void setShow_place(String show_place) {
        this.show_place = show_place;
    }

    public double getOrder_money() {
        return order_money;
    }

    public void setOrder_money(double order_money) {
        this.order_money = order_money;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public int getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(int order_amount) {
        this.order_amount = order_amount;
    }

    public String getOrder_sts() {
        return order_sts;
    }

    public void setOrder_sts(String order_sts) {
        this.order_sts = order_sts;
    }
}

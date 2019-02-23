package com.piaoniu.demo.model;

import java.util.Date;

public class Order2 {

    private String order_number;     //订单编号
    private Date order_time;         //下订单时间
    private String consignee;        //收货人
    private String consignee_phone;  //收货人手机号
    private double order_money;      //订单总金额
    private int order_amount;   //购买的数量
    private String order_sts;  //订单状态
    private String save_way;  //配送方式
    private String show_name;   //演出名称
    private String show_begin_time;   //演出开始时间
    private double show_money;   //演出票价格
    private String show_place;  //演出地点

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConsignee_phone() {
        return consignee_phone;
    }

    public void setConsignee_phone(String consignee_phone) {
        this.consignee_phone = consignee_phone;
    }

    public double getOrder_money() {
        return order_money;
    }

    public void setOrder_money(double order_money) {
        this.order_money = order_money;
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

    public String getSave_way() {
        return save_way;
    }

    public void setSave_way(String save_way) {
        this.save_way = save_way;
    }

    public String getShow_name() {
        return show_name;
    }

    public void setShow_name(String show_name) {
        this.show_name = show_name;
    }

    public String getShow_begin_time() {
        return show_begin_time;
    }

    public void setShow_begin_time(String show_begin_time) {
        this.show_begin_time = show_begin_time;
    }

    public double getShow_money() {
        return show_money;
    }

    public void setShow_money(double show_money) {
        this.show_money = show_money;
    }

    public String getShow_place() {
        return show_place;
    }

    public void setShow_place(String show_place) {
        this.show_place = show_place;
    }
}

package com.piaoniu.demo.model;

public class User_CouponModel {

    private int user_id;        //用户id
    private int discount_id;    //优惠券id
    private int show_type_id;  //演出类型id
    private int discount_status_id; //优惠券状态id
    private int discount_money; //优惠券金额
    private String discount_begin;//优惠券赠送时间
    private String discount_end; //优惠券结束时间
    private String show_type;  //演出类型
    private String discount_name;  //优惠券介绍

    public String getShow_type() {
        return show_type;
    }

    public void setShow_type(String show_type) {
        this.show_type = show_type;
    }

    public int getShow_type_id() {
        return show_type_id;
    }

    public void setShow_type_id(int show_type_id) {
        this.show_type_id = show_type_id;
    }

    public int getDiscount_status_id() {
        return discount_status_id;
    }

    public void setDiscount_status_id(int discount_status_id) {
        this.discount_status_id = discount_status_id;
    }

    public String getDiscount_name() {
        return discount_name;
    }

    public void setDiscount_name(String discount_name) {
        this.discount_name = discount_name;
    }

    public int getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(int discount_id) {
        this.discount_id = discount_id;
    }

    public int getDiscount_money() {
        return discount_money;
    }

    public void setDiscount_money(int discount_money) {
        this.discount_money = discount_money;
    }

    public String getDiscount_begin() {
        return discount_begin;
    }

    public void setDiscount_begin(String discount_begin) {
        this.discount_begin = discount_begin;
    }

    public String getDiscount_end() {
        return discount_end;
    }

    public void setDiscount_end(String discount_end) {
        this.discount_end = discount_end;
    }



    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}

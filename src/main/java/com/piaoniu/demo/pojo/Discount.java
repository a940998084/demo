package com.piaoniu.demo.pojo;

import java.util.Date;

/**
 * 优惠券
 */
public class Discount {
    private int discount_id;     //优惠券id
    private int discount_money;  //优惠券金额
    private Date discount_begin;  //优惠券开始时间
    private Date discount_end;    //优惠券过期时间
    private int show_type_id;     //演出类似id
    private int discount_status_id;   //优惠券状态id
    private int user_id;           //用户id

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

    public Date getDiscount_begin() {
        return discount_begin;
    }

    public void setDiscount_begin(Date discount_begin) {
        this.discount_begin = discount_begin;
    }

    public Date getDiscount_end() {
        return discount_end;
    }

    public void setDiscount_end(Date discount_end) {
        this.discount_end = discount_end;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}

package com.piaoniu.demo.pojo;

/**
 * 优惠券状态
 */
public class DiscountStatus {
    private int discount_status_id;   //优惠券状态id
    private String discount_status;   //优惠券状态

    public int getDiscount_status_id() {
        return discount_status_id;
    }

    public void setDiscount_status_id(int discount_status_id) {
        this.discount_status_id = discount_status_id;
    }

    public String getDiscount_status() {
        return discount_status;
    }

    public void setDiscount_status(String discount_status) {
        this.discount_status = discount_status;
    }
}

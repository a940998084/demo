package com.piaoniu.demo.pojo;

/**
 * 订单状态
 */
public class OrderStatus {
    private int order_status_id;  //订单状态id
    private String order_status;  //订单状态

    public int getOrder_status_id() {
        return order_status_id;
    }

    public void setOrder_status_id(int order_status_id) {
        this.order_status_id = order_status_id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
}

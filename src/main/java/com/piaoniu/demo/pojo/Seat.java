package com.piaoniu.demo.pojo;

/**
 * 座位表
 */
public class Seat {
    private int seat_id;  //座位id
    private int show_id;  //演出id
    private double seat_money; //座位价格
    private int seat_status_type_id;  //座位状态id
    private int show_place_id;   //演出地点id
    private String seat_number;  //座位号（几排几号）

    public int getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public double getSeat_money() {
        return seat_money;
    }

    public void setSeat_money(double seat_money) {
        this.seat_money = seat_money;
    }

    public int getSeat_status_type_id() {
        return seat_status_type_id;
    }

    public void setSeat_status_type_id(int seat_status_type_id) {
        this.seat_status_type_id = seat_status_type_id;
    }

    public int getShow_place_id() {
        return show_place_id;
    }

    public void setShow_place_id(int show_place_id) {
        this.show_place_id = show_place_id;
    }

    public String getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(String seat_number) {
        this.seat_number = seat_number;
    }
}

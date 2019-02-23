package com.piaoniu.demo.pojo;

/**
 * 座位表
 */
public class Seat {
    private int seat_id;  //座位id
    private int show_id;  //演出id
    private double seat_money; //座位价格
    private int seat_status_type_id;  //座位状态id
    private String seat_number;  //座位号（几排几号）
    private int hall_id;   //演厅id
    private int seat_num;    //座位数量

    public int getSeat_num() {
        return seat_num;
    }

    public void setSeat_num(int seat_num) {
        this.seat_num = seat_num;
    }

    public int getHall_id() {
        return hall_id;
    }

    public void setHall_id(int hall_id) {
        this.hall_id = hall_id;
    }

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


    public String getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(String seat_number) {
        this.seat_number = seat_number;
    }
}

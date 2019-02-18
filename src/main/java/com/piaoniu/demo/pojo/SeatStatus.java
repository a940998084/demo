package com.piaoniu.demo.pojo;

/**
 * 座位状态
 */
public class SeatStatus {
    private int seat_status_id;  //座位状态id
    private String seat_status;  //座位状态

    public int getSeat_status_id() {
        return seat_status_id;
    }

    public void setSeat_status_id(int seat_status_id) {
        this.seat_status_id = seat_status_id;
    }

    public String getSeat_status() {
        return seat_status;
    }

    public void setSeat_status(String seat_status) {
        this.seat_status = seat_status;
    }
}

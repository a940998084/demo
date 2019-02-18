package com.piaoniu.demo.pojo;

/**
 * 演出地点
 */
public class ShowPlace {
    private int show_place_id;  //演出地点id
    private String show_place;  //演出地点
    private int seat_sum;   //座位总数

    public int getShow_place_id() {
        return show_place_id;
    }

    public void setShow_place_id(int show_place_id) {
        this.show_place_id = show_place_id;
    }

    public String getShow_place() {
        return show_place;
    }

    public void setShow_place(String show_place) {
        this.show_place = show_place;
    }

    public int getSeat_sum() {
        return seat_sum;
    }

    public void setSeat_sum(int seat_sum) {
        this.seat_sum = seat_sum;
    }
}

package com.piaoniu.demo.pojo;

/**
 * 演出地点
 */
public class ShowPlace {
    private int show_place_id;  //演出地点id
    private String show_place;  //演出地点
    private int city_id;   //城市id

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

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }
}

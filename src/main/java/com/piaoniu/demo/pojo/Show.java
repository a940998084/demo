package com.piaoniu.demo.pojo;

/**
 * 演出票信息
 */
public class Show {
    private int show_id;        //演出票id
    private int show_type_id;   //演出类型id
    private String show_time;   //演出时间
    private int show_place_id;  //演出地点id
    private String show_people; //演出者（人）
    private String show_name;   //演出名称
    private String show_picture; //演出图
    private double show_money;   //演出票价格
    private int city_id;    //城市id
    private int show_status_id; //演出状态id
    private String show_message; //演出信息
    private int show_attention;  //关注量
    private int show_discount;   //演出票折扣

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public int getShow_type_id() {
        return show_type_id;
    }

    public void setShow_type_id(int show_type_id) {
        this.show_type_id = show_type_id;
    }

    public String getShow_time() {
        return show_time;
    }

    public void setShow_time(String show_time) {
        this.show_time = show_time;
    }

    public int getShow_place_id() {
        return show_place_id;
    }

    public void setShow_place_id(int show_place_id) {
        this.show_place_id = show_place_id;
    }

    public String getShow_people() {
        return show_people;
    }

    public void setShow_people(String show_people) {
        this.show_people = show_people;
    }

    public String getShow_name() {
        return show_name;
    }

    public void setShow_name(String show_name) {
        this.show_name = show_name;
    }

    public String getShow_picture() {
        return show_picture;
    }

    public void setShow_picture(String show_picture) {
        this.show_picture = show_picture;
    }

    public double getShow_money() {
        return show_money;
    }

    public void setShow_money(double show_money) {
        this.show_money = show_money;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getShow_status_id() {
        return show_status_id;
    }

    public void setShow_status_id(int show_status_id) {
        this.show_status_id = show_status_id;
    }

    public String getShow_message() {
        return show_message;
    }

    public void setShow_message(String show_message) {
        this.show_message = show_message;
    }

    public int getShow_attention() {
        return show_attention;
    }

    public void setShow_attention(int show_attention) {
        this.show_attention = show_attention;
    }

    public int getShow_discount() {
        return show_discount;
    }

    public void setShow_discount(int show_discount) {
        this.show_discount = show_discount;
    }
}

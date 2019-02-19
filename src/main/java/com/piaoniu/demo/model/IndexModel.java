package com.piaoniu.demo.model;

public class IndexModel {
    private String show_time;   //演出时间
    private String show_place;  //演出地点
    private String show_name;   //演出名称
    private String show_picture; //演出图
    private double show_money;   //演出票价格
    private String city_name;    //城市名称
    private String show_comment_grade; //演出评分

    public String getShow_comment_grade() {
        return show_comment_grade;
    }

    public void setShow_comment_grade(String show_comment_grade) {
        this.show_comment_grade = show_comment_grade;
    }

    public String getShow_time() {
        return show_time;
    }

    public void setShow_time(String show_time) {
        this.show_time = show_time;
    }

    public String getShow_place() {
        return show_place;
    }

    public void setShow_place(String show_place) {
        this.show_place = show_place;
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

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
}

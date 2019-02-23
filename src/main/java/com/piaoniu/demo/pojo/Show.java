package com.piaoniu.demo.pojo;

/**
 * 演出票信息
 */
public class Show {
    private int show_id;        //演出票id
    private int show_type_id;   //演出类型id
    private String show_begin_time;   //演出开始时间
    private String show_end_time;   //演出结束时间
    private int show_times;    //演出时间区间
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
    private double show_comment_grade;   //演出评分
    private int show_comment_num;      //评论人数
    private int show_sort;         //排序方式id

    public int getShow_sort() {
        return show_sort;
    }

    public void setShow_sort(int show_sort) {
        this.show_sort = show_sort;
    }

    public int getShow_times() {
        return show_times;
    }

    public void setShow_times(int show_times) {
        this.show_times = show_times;
    }
    private double show_comment_grade;//演出评分
    private int show_comment_num;  //评论人数量

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

    public String getShow_begin_time() {
        return show_begin_time;
    }

    public void setShow_begin_time(String show_begin_time) {
        this.show_begin_time = show_begin_time;
    }

    public String getShow_end_time() {
        return show_end_time;
    }

    public void setShow_end_time(String show_end_time) {
        this.show_end_time = show_end_time;
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

    public double getShow_comment_grade() {
        return show_comment_grade;
    }

    public void setShow_comment_grade(double show_comment_grade) {
        this.show_comment_grade = show_comment_grade;
    }

    public int getShow_comment_num() {
        return show_comment_num;
    }

    public void setShow_comment_num(int show_comment_num) {
        this.show_comment_num = show_comment_num;
    }
}

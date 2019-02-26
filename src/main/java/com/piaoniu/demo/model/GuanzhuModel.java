package com.piaoniu.demo.model;



public class GuanzhuModel {
    private int show_id;//演出id
    private int like_id;//关注状态id
    private int user_id;//用户id
    private int show_money;//起始价
    private int show_status_id; //关注状态id
    private String show_begin_time; //开始时间
    private String show_end_time;//结束时间
    private String show_place;//演出地点
    private String show_name;//演出名称
    private String show_picture;//演出图片
    private String show_status; //演出状态
    private int show_attention; //关注量


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getShow_status_id() {
        return show_status_id;
    }

    public void setShow_status_id(int show_status_id) {
        this.show_status_id = show_status_id;
    }

    public int getShow_attention() {
        return show_attention;
    }

    public void setShow_attention(int show_attention) {
        this.show_attention = show_attention;
    }

    public int getLike_id() {
        return like_id;
    }

    public void setLike_id(int like_id) {
        this.like_id = like_id;
    }

    public int getShow_money() {
        return show_money;
    }

    public void setShow_money(int show_money) {
        this.show_money = show_money;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
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

    public String getShow_status() {
        return show_status;
    }

    public void setShow_status(String show_status) {
        this.show_status = show_status;
    }
}
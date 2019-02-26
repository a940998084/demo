package com.piaoniu.demo.model;

public class CommentModel {
    private int comment_id;
    private int show_id;
    private String comment_message;
    private String path;
    private String user_head_photo;
    private String user_username;
    private String love;
    private double comment_grade;
    private double show_comment_grade;
    private int show_comment_num;
    private String comment_creat_time;
    private String comment_picture;  //评论图片


    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public String getComment_creat_time() {
        return comment_creat_time;
    }

    public void setComment_creat_time(String comment_creat_time) {
        this.comment_creat_time = comment_creat_time;
    }

    public String getComment_message() {
        return comment_message;
    }

    public void setComment_message(String comment_message) {
        this.comment_message = comment_message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUser_head_photo() {
        return user_head_photo;
    }

    public void setUser_head_photo(String user_head_photo) {
        this.user_head_photo = user_head_photo;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public double getComment_grade() {
        return comment_grade;
    }

    public void setComment_grade(double comment_grade) {
        this.comment_grade = comment_grade;
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

    public String getComment_picture() {
        return comment_picture;
    }

    public void setComment_picture(String comment_picture) {
        this.comment_picture = comment_picture;
    }
}

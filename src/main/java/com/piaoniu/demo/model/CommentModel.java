package com.piaoniu.demo.model;

public class CommentModel {
    private String comment_message;
    private String comment_photo;
    private String user_head_photo;
    private String user_username;
    private String love;
    private double comment_grade;
    private double show_comment_grade;
    private int show_comment_num;

    public String getComment_message() {
        return comment_message;
    }

    public void setComment_message(String comment_message) {
        this.comment_message = comment_message;
    }

    public String getComment_photo() {
        return comment_photo;
    }

    public void setComment_photo(String comment_photo) {
        this.comment_photo = comment_photo;
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
}

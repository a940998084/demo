package com.piaoniu.demo.pojo;

/**
 * 评论
 */
public class Comment {
    private int comment_id;      //评论id
    private int user_id;         //评论人id
    private String comment_message; //评论内容
    private int love;              //点赞数
    private int show_id;           //演出id
    private double comment_grade;   //评分
    private String comment_creat_time;//评论创建时间

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getComment_message() {
        return comment_message;
    }

    public void setComment_message(String comment_message) {
        this.comment_message = comment_message;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public double getComment_grade() {
        return comment_grade;
    }

    public void setComment_grade(double comment_grade) {
        this.comment_grade = comment_grade;
    }

    public String getComment_creat_time() {
        return comment_creat_time;
    }

    public void setComment_creat_time(String comment_creat_time) {
        this.comment_creat_time = comment_creat_time;
    }
}

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
    private String comment_photo;  //评论图片
    private String comment_grade;   //评分
    private int comment_next_id;    //评论副id

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

    public String getComment_photo() {
        return comment_photo;
    }

    public void setComment_photo(String comment_photo) {
        this.comment_photo = comment_photo;
    }

    public String getComment_grade() {
        return comment_grade;
    }

    public void setComment_grade(String comment_grade) {
        this.comment_grade = comment_grade;
    }

    public int getComment_next_id() {
        return comment_next_id;
    }

    public void setComment_next_id(int comment_next_id) {
        this.comment_next_id = comment_next_id;
    }
}

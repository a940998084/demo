package com.piaoniu.demo.pojo;

/**
 * 评论回复
 */
public class CommentChild {
    private int comment_child_id;// 评论副id
    private int comment_parent_id;      //评论主id
    private int user_id;         //评论人id
    private String comment_message; //评论内容
    private int show_id;           //演出id
    private String comment_creat_time;//评论创建时间

    public int getComment_child_id() {
        return comment_child_id;
    }

    public void setComment_child_id(int comment_child_id) {
        this.comment_child_id = comment_child_id;
    }

    public int getComment_parent_id() {
        return comment_parent_id;
    }

    public void setComment_parent_id(int comment_parent_id) {
        this.comment_parent_id = comment_parent_id;
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
}

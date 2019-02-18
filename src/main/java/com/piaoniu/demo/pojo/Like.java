package com.piaoniu.demo.pojo;

/**
 * \关注的演出
 */
public class Like {
    private int user_id;   //用户id
    private int show_id;   //关注的演出id

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }
}

package com.piaoniu.demo.pojo;
/**
 * 用户表
 *
 */

public class User {
    private int user_id; //用户id
    private String user_phone; //用户手机号
    private double user_money; //用户余额
    private String user_head_photo; //用户头像
    private String user_password; //用户密码
    private String user_signature; //用户个性签名
    private String user_username; //用户昵称

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public double getUser_money() {
        return user_money;
    }

    public void setUser_money(double user_money) {
        this.user_money = user_money;
    }

    public String getUser_head_photo() {
        return user_head_photo;
    }

    public void setUser_head_photo(String user_head_photo) {
        this.user_head_photo = user_head_photo;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_signature() {
        return user_signature;
    }

    public void setUser_signature(String user_signature) {
        this.user_signature = user_signature;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }
}

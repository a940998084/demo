package com.piaoniu.demo.model;

import com.piaoniu.demo.pojo.User;

public class LoginUserInfo {
    private User user;
    private Double user_money;
    private int ticketUser;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getUser_money() {
        return user_money;
    }

    public void setUser_money(Double user_money) {
        this.user_money = user_money;
    }

    public int getTicketUser() {
        return ticketUser;
    }

    public void setTicketUser(int ticketUser) {
        this.ticketUser = ticketUser;
    }
}

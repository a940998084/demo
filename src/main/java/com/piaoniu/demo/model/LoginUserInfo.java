package com.piaoniu.demo.model;

public class LoginUserInfo {
    private LoginModel loginModel;
    private Double user_money;
    private int ticketUser;

    public LoginModel getLoginModel() {
        return loginModel;
    }

    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
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

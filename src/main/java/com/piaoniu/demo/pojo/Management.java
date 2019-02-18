package com.piaoniu.demo.pojo;

/**
 * 管理员
 */
public class Management {
    private int management_id;    //管理员id
    private int management_type_id;  //管理员类型id
    private String management_name;  //管理员名

    public int getManagement_id() {
        return management_id;
    }

    public void setManagement_id(int management_id) {
        this.management_id = management_id;
    }

    public int getManagement_type_id() {
        return management_type_id;
    }

    public void setManagement_type_id(int management_type_id) {
        this.management_type_id = management_type_id;
    }

    public String getManagement_name() {
        return management_name;
    }

    public void setManagement_name(String management_name) {
        this.management_name = management_name;
    }
}

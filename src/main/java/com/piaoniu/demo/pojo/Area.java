package com.piaoniu.demo.pojo;

/**
 * 地区
 */
public class Area {
    private int area_id;    //地区id
    private String area;    //地区
    private int area_dad_id;  //地区副id

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getArea_dad_id() {
        return area_dad_id;
    }

    public void setArea_dad_id(int area_dad_id) {
        this.area_dad_id = area_dad_id;
    }
}

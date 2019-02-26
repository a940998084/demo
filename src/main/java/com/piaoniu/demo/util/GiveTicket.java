package com.piaoniu.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GiveTicket {
    private String tTime;

    public String gettTime() {
        return tTime;
    }

    public void settTime(String tTime) {
        this.tTime = tTime;
    }

    public GiveTicket(int day){
        Date date=new Date();
        date.setDate(date.getDate()+day);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        this.tTime=simpleDateFormat.format(date);
    }
}

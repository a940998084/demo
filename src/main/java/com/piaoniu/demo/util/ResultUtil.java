package com.piaoniu.demo.util;

public class ResultUtil {
    public static Msg success(Object objet){
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMessage("请求成功");
        msg.setData(objet);
        return msg;
    }
    public static Msg success(){
        return success(null);
    }
    public static Msg error(Integer code,String resultmsg){
        Msg msg = new Msg();
        msg.setCode(code);
        msg.setMessage(resultmsg);
        return msg;

    }
}

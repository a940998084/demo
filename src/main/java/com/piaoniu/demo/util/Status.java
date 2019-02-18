package com.piaoniu.demo.util;
//状态码
public class Status {
    public static Json getStatus(int status,Object... data){
        Json json=new Json();
        String message=null;
        switch (status){
            case 0:
                message="成功！";
                break;
            case 1:
                message="参数有误！";
                break;
            case 2:
                message="参数不全！";
                break;
        }
        json.setStatus(status);
        json.setMessage(message);
        if (status==0){
            json.setData(data);
        }
        return json;
    }
}

package com.piaoniu.demo.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SMSCodeService {
    public static boolean sendCode(String phonenum,String code) throws Exception{
        String code_str = URLEncoder.encode("#code#="+code,"utf-8");

        //包装URL
        URL url = new URL("http://v.juhe.cn/sms/send?mobile="+phonenum+"&tpl_id=135883&tpl_value="+code_str+"&key=4c54b1ea0d28eadf759ad284d95591c2");

        //打开连接，得到连接对象
        URLConnection connection=url.openConnection();
        //向服务器发出请求
        connection.connect();

        //获得服务器响应的数据
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
        StringBuffer buffer=new StringBuffer();
        String lineData=null;
        while ((lineData=bufferedReader.readLine())!=null){
            buffer.append(lineData);
        }
        bufferedReader.close();
        if (buffer.toString().indexOf("\"error_code\":0")>0){
            return true;
        }
        return false;
    }
}

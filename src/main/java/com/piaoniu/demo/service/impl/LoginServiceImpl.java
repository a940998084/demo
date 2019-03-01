package com.piaoniu.demo.service.impl;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.piaoniu.demo.dao.LoginDao;
import com.piaoniu.demo.model.LoginUserInfo;
import com.piaoniu.demo.pojo.User;
import com.piaoniu.demo.service.LoginService;
import com.piaoniu.demo.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private LoginDao loginDao;

    Gson gson=new Gson();

    Timer timer=new Timer();

    //生成验证码
    @Override
    public boolean getCode(String user_phone) {
        //生成字符串
        StringBuffer buffer=new StringBuffer();
        Random random=new Random();
        for (int i=0;i<4;i++){
            buffer.append(random.nextInt(10));
        }
        String codeString = redisTemplate.opsForValue().get("code");
        Map<String, String> code = gson.fromJson(codeString, new TypeToken<Map<String, String>>() {
        }.getType());
        boolean falg=false;
        try {
            if(!SMSCodeService.sendCode(user_phone,buffer.toString())){
                    falg=false;
                }else {
                    //将验证码，手机号，系统时间存在redis
                    code.put(user_phone,buffer.toString());
                    redisTemplate.opsForValue().set("code",gson.toJson(code));
                    TimerTask timerTask=new TimerTask() {
                        @Override
                        public void run() {
                            code.put(user_phone,null);
                            redisTemplate.opsForValue().set("code",gson.toJson(code));
                        }
                    };
                    timer.schedule(timerTask,20000);
                    falg=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return falg;
    }

    @Override
    public Json proof(String user_phone, String codeNew) {
        String codeString=redisTemplate.opsForValue().get("code");
        Map<String,String> code = gson.fromJson(codeString,new TypeToken<Map<String,String>>(){}.getType());

        Json json=new Json();

        if (!code.containsKey(user_phone)){
            json.setStatus(2);
            json.setMessage("未发送验证码");
            return json;
        }

        if (code.get(user_phone)==null){
            json.setStatus(1);
            json.setMessage("验证码已过期");
            return json;
        }

        if (code.get(user_phone).trim().equalsIgnoreCase(codeNew)){
            json.setStatus(0);
            json.setMessage("登录成功");
            timer.cancel();
            code.remove(user_phone);
            redisTemplate.opsForValue().set("code",gson.toJson(code));
            return json;
        }else {
            json.setStatus(2);
            json.setMessage("验证码错误");
            return json;
        }
    }

    //注册登录
    @Override
    public User proofUser(String user_phone) {
        int a = loginDao.findUser(user_phone);
        User user;
        if (a>0){
            //登录
            user=loginDao.findPass(user_phone);
            return user;
        }else {
            //注册
            loginDao.userAdd(user_phone);
            user=loginDao.findPass(user_phone);
            return user;
       }
//        //存入redis
//        Gson gson=new Gson();
//        LoginUserInfo loginUserInfo = loginUserInfo(user.getUser_id(),user);
//        String users=redisTemplate.opsForValue().get("LoginUserInfo");
//        Map<Integer,LoginUserInfo> userMap=gson.fromJson(users,new TypeToken<Map<Integer,LoginUserInfo>>(){}.getType());
//        userMap.put(user.getUser_id(),loginUserInfo);
//        redisTemplate.opsForValue().set("LoginUserInfo",gson.toJson(userMap));

//        String num=redisTemplate.opsForValue().get("shopNum");
//        Map<Integer,Integer> shopNum=gson.fromJson(num,new TypeToken<Map<Integer,Integer>>(){}.getType());
//        shopNum.put(user.getUser_id(),loginDao.findShop(user.getUser_id()));
//        redisTemplate.opsForValue().set("shopNum",gson.toJson(shopNum));

    }

    @Override
    public LoginUserInfo loginUserInfo(int user_phone, User user) {
        LoginUserInfo loginUserInfo=new LoginUserInfo();
        loginUserInfo.setUser(user);
        return loginUserInfo;
    }



//
//    @Override
//    public void addUser(int user_id) {
//        loginDao.userBalAdd(user_id);
//        GiveTicket giveTicket=new GiveTicket(7);
//    }
}

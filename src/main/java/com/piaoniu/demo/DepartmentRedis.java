/*
package com.piaoniu.demo;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.piaoniu.demo.model.Order2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.TimeUnit;

*/
/*创建部门实体的Redis服务类
  redis没有表结构的概念,所以要实现mysql数据库中的表的数据在redis中存储,必须做一些转换
  使用json的格式的文本作为redis与java普通对象相互交换数据的存储格式.
  取出数据时,将json的文本数据转换为java对象

  redis - key-value的方式来存储数据,所以在存入时要生成一个唯一的key值
          查询,删除,都需要通过这个唯一的key值来进行操作
        - 设定时间
          保存在redis数据库中的数据默认是永久存储,但是,可以指定一个时限来确定数据的生命周期
          ,如果超过了指定时限的数据将会被redis自动清除.
*//*

@Repository
public class DepartmentRedis {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;


    // redis中保存单个对象
    public void add(String key, Order2 order2 , Long time){
        Gson gson=new Gson();
        redisTemplate.opsForValue().set(key,gson.toJson(order2),time,TimeUnit.MINUTES);
    }
    //保存list集合
    public void add(String key, List<Order2> order2s , Long time){
        Gson gson=new Gson();
        redisTemplate.opsForValue().set(key,gson.toJson(order2s),time,TimeUnit.MINUTES);
    }

    //使用get获取单个对象
    public Order2 get(String key){
       String department= redisTemplate.opsForValue().get(key);
       //将json字符串转化为实体对象
        Gson gson=new Gson();
        return gson.fromJson(department,Order2.class);

    }
    //使用get获取对象集合
    public  List<Order2> getlist(String key){
        String department= redisTemplate.opsForValue().get(key);
        //将json字符串转化为实体对象的集合
        Gson gson=new Gson();
       List<Order2> list=gson.fromJson(department,new TypeToken<List<Order2>>(){}.getType());
        return list;
    }
    //根据key值进行删除
    public void delete(String key){
        redisTemplate.opsForValue().getOperations().delete(key);
    }
}

*/

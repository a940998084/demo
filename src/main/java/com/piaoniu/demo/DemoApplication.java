package com.piaoniu.demo;

import com.google.gson.Gson;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
@EnableScheduling
@EnableSwagger2
@MapperScan("com.piaoniu.demo.dao")
@EntityScan("com.piaoniu.demo.pojo")
public class DemoApplication {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    Gson gson=new Gson();
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public void INIT(){
        Map<String, String> code=new LinkedHashMap<>();
        redisTemplate.opsForValue().set("code",gson.toJson(code));
    }}

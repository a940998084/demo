package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.CommentPhoto;
import com.piaoniu.demo.pojo.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public interface UserCentreService {

    //根据用户id查询相关信息
    List<User> selectUserCentre(Integer user_id);

    //根据用户id修改个人信息
    int updateUserCentre(User user);

    //上传头像并修改个人信息
    public void insetpath(MultipartFile files,Integer user_id,String user_username,String user_signature);
}

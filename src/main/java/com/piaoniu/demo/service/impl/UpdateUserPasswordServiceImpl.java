package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.UpdateUserPasswordDao;
import com.piaoniu.demo.pojo.User;
import com.piaoniu.demo.service.UpdateUserPasswordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UpdateUserPasswordServiceImpl implements UpdateUserPasswordService {
    @Resource
    UpdateUserPasswordDao updateUserPasswordDao;

    @Override
    public String selectPw(Integer user_id) {
        return updateUserPasswordDao.selectPw(user_id);
    }

    @Override
    public int upUserPw(User user) {
        return updateUserPasswordDao.upUserPw(user);
    }

    @Override
    public void upUserPw1(Integer user_id, String user_password, String user_newPassword, String user_newPassword1) {
        String user_password2=this.selectPw(user_id);
        System.out.println(user_password2);
        if (user_password2!=null&&user_password2!="") {
            if (user_password2.equals(user_password)) {
                if (!user_password.equals(user_newPassword)) {
                    if (user_newPassword.equals(user_newPassword1)) {
                        User user=new User();
                        user.setUser_id(user_id);
                        user.setUser_password(user_newPassword);
                        this.upUserPw(user);
                        System.out.println("修改成功");
                    } else {
                        System.out.println("两次密码不匹配");
                    }
                }else {
                    System.out.println("您输入的新密码与旧密码重复了");
                }

            }else {
                System.out.println("旧密码输入错误");
            }
        }else {
            if (user_newPassword.equals(user_newPassword1)) {
                User user=new User();
                user.setUser_id(user_id);
                user.setUser_password(user_newPassword);
                this.upUserPw(user);
                System.out.println("修改成功");
            }else {
                System.out.println("两次密码不匹配");
            }
        }

    }


}

package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.UserCentreDao;
import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.CommentPhoto;
import com.piaoniu.demo.pojo.User;
import com.piaoniu.demo.service.UserCentreService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Service
public class UserCentreServiceImpl implements UserCentreService {
    @Resource
    UserCentreDao userCentreDao;

    @Override
    public List<User> selectUserCentre(Integer user_id) {
        return userCentreDao.selectUserCentre(user_id);
    }

    @Override
    public int updateUserCentre(User user) {
        return userCentreDao.updateUserCentre(user);
    }

    @Override
    public void insetpath(MultipartFile files,Integer user_id, String user_username, String user_signature) {
        String path="F:\\demo\\src\\main\\resources\\static\\img\\";
        String fileName=null;
            if (!files.isEmpty()) {
                // 获取文件名后缀名
                String suffix = files.getOriginalFilename();
                String prefix = suffix.substring(suffix.lastIndexOf(".") + 1);
                //为防止文件重名被覆盖，文件名取名为：当前日期 + 1-1000内随机数
                Random random = new Random();
                Integer randomFileName = random.nextInt(1000);
                fileName = System.currentTimeMillis() + randomFileName + "." + prefix;
                //创建文件路径
                File filepath = new File(path, fileName);
                if (!filepath.getParentFile().exists()) {
                    filepath.getParentFile().mkdirs();
                }
                try {
                    files.transferTo(new File(path+File.separator+fileName));
                    //查询个人信息
                    List<User> userList=this.selectUserCentre(user_id);
                    //修改信息
                    String user_head_photo=path+fileName;
                    User user=new User();
                    user.setUser_id(user_id);
                    user.setUser_username(user_username);
                    user.setUser_signature(user_signature);
                    user.setUser_head_photo(user_head_photo);
                    int xiugai=userCentreDao.updateUserCentre(user);
                    if (xiugai>0){
                        System.out.println("修改成功");
                    }else {
                        System.out.println("修改失败");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {

            }
    }

}

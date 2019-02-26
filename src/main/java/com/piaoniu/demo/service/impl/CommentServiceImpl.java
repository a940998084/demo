package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.CommentDao;
import com.piaoniu.demo.model.CommentModel;
import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.CommentChild;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    CommentDao commentDao;


    @Override
    public List<Show> findShowById(Integer show_id) {
        return commentDao.findShowById(show_id);
    }

    @Override
    public List<CommentModel> findCommentByChildId(Integer comment_next_id) {
        return commentDao.findCommentByChildId(comment_next_id);
    }

    @Override
    public int updateShowGrade(Show show) {
        return commentDao.updateShowGrade(show);
    }

    @Override
    public int insertComment(Comment comment) {
        return commentDao.insertComment(comment);
    }

    @Override
    public int insertCommentChild(CommentChild commentChild) {
        return commentDao.insertCommentChild(commentChild);
    }

    @Override
    public List<CommentModel> findComment(Comment comment) {
        return commentDao.findComment(comment);
    }

    public void updateService(Comment comment){
        List<Show> showList=findShowById(comment.getShow_id());
        Iterator iterator=showList.iterator();
        while (iterator.hasNext()){
            Show show=(Show) iterator.next();
            double a=show.getShow_comment_grade();
            int b=show.getShow_comment_num();
            double c=comment.getComment_grade();
            double d=(a*b+c)/(b+1);
            Show show1=new Show();
            show1.setShow_id(comment.getShow_id());
            show1.setShow_comment_num(b+1);
            show1.setShow_comment_grade(d);
            updateShowGrade(show1);
        }
    }

    public void insetpath(MultipartFile files,Comment comment) {
        String path="E:\\ideawork\\demo\\src\\main\\resources\\static\\img\\";
        /*  for (int i = 0; i < files.length; i++) {*/
        if (!files.isEmpty()) {
            // 获取文件名后缀名
            String suffix = files.getOriginalFilename();
            String prefix = suffix.substring(suffix.lastIndexOf(".") + 1);
            //为防止文件重名被覆盖，文件名取名为：当前日期 + 1-1000内随机数
            Random random = new Random();
            Integer randomFileName = random.nextInt(1000);
            String fileName = System.currentTimeMillis() + randomFileName + "." + prefix;
            System.out.println(fileName);
            //创建文件路径
            File filepath = new File(path, fileName);
            System.out.println(filepath.toString());
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            try {
                files.transferTo(new File(path+File.separator+fileName));
                Date date=new Date();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String dates=df.format(date);
                comment.setComment_creat_time(dates);
                comment.setComment_picture(fileName);
                insertComment(comment);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

        }
    }
}

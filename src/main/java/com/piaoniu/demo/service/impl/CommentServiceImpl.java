package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.CommentDao;
import com.piaoniu.demo.model.CommentModel;
import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.CommentChild;
import com.piaoniu.demo.pojo.CommentPhoto;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.service.CommentService;
import com.piaoniu.demo.util.Status;
import org.apache.ibatis.annotations.Param;
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
    public List<CommentModel> findCommentById(Integer show_id) {
        return commentDao.findCommentById(show_id);
    }

    @Override
    public List<CommentModel> findCommentByChildId(Integer comment_next_id) {
        return commentDao.findCommentByChildId(comment_next_id);
    }

    @Override
    public List<CommentModel> findAllComment() {
        return commentDao.findAllComment();
    }

    @Override
    public int updateShowGrade(Show show) {
        return commentDao.updateShowGrade(show);
    }

    @Override
    public int insertComment(Comment comment) {
        Date date=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dates=df.format(date);
        comment.setComment_creat_time(dates);
        return commentDao.insertComment(comment);
    }

    @Override
    public int insert(Comment comment) {
        return commentDao.insert(comment);
    }

    @Override
    public int insertCommentChild(CommentChild commentChild) {
        return commentDao.insertCommentChild(commentChild);
    }

    @Override
    public List<CommentModel> findComment(Comment comment) {
        return commentDao.findComment(comment);
    }

    @Override
    public int insertPhtotPath(CommentPhoto commentPhoto) {
        return commentDao.insertPhtotPath(commentPhoto);
    }

    public void updateService(Integer show_id,Comment comment){
        List<CommentModel> commentModelList=findCommentById(show_id);
        Iterator iterator=commentModelList.iterator();
        while (iterator.hasNext()){
            CommentModel commentModel1=(CommentModel) iterator.next();
            double a=commentModel1.getShow_comment_grade();
            System.out.println(a);
            int b=commentModel1.getShow_comment_num();
            System.out.println(b);
            double c=comment.getComment_grade();
            System.out.println(c);
            double d=(a*b+c)/(b+1);
            System.out.println(d);
            Show show=new Show();
            show.setShow_id(show_id);
            show.setShow_comment_num(b+1);
            show.setShow_comment_grade(d);
            updateShowGrade(show);
        }
    }

    public void insetpath(MultipartFile[] files,Comment comment) {
        String path="E:\\ideawork\\demo\\src\\main\\resources\\static\\img\\";
        System.out.println(files.length);
        for (int i = 0; i < files.length; i++) {
            if (!files[i].isEmpty()) {
                // 获取文件名后缀名
                String suffix = files[i].getOriginalFilename();
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
                    files[i].transferTo(new File(path+File.separator+fileName));
                    //增加商品主图片路径
                    CommentPhoto commentPhoto = new CommentPhoto();
                    commentPhoto.setComment_id(comment.getComment_id());
                    commentPhoto.setPath(path);
                    insertPhtotPath(commentPhoto);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {

            }
        }
    }
}

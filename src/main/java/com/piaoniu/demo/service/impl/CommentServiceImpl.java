package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.CommentDao;
import com.piaoniu.demo.model.CommentModel;
import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.service.CommentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    CommentDao commentDao;


    @Override
    public List<CommentModel> findComment(Integer show_id) {
        return commentDao.findComment(show_id);
    }

    @Override
    public int updateShowGrade(Show show) {
        return commentDao.updateShowGrade(show);
    }

    @Override
    public int insertComment(Comment comment) {
        return commentDao.insertComment(comment);
    }
}

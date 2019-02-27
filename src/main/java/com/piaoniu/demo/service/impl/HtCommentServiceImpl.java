package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.Ht_CommentDao;
import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.CommentChild;
import com.piaoniu.demo.service.HtCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HtCommentServiceImpl implements HtCommentService {
    @Resource
    private Ht_CommentDao ht_commentDao;
    @Override
    public List<Comment> findAllCommentInfo() {
        return ht_commentDao.findAllCommentInfo();
    }

    @Override
    public List<CommentChild> findAllChildCommentInfo() {
        return ht_commentDao.findAllChildCommentInfo();
    }

    @Override
    public int deleteComment(int comment_id) {
        return ht_commentDao.deleteComment(comment_id);
    }

    @Override
    public int deleteChirlComment(int comment_child_id) {
        return ht_commentDao.deleteChirlComment(comment_child_id);
    }
}

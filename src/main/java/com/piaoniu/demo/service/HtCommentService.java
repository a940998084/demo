package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.CommentChild;

import java.util.List;

public interface HtCommentService {
    List<Comment> findAllCommentInfo();
    List<CommentChild> findAllChildCommentInfo();
    int deleteComment(int comment_id);
    int deleteChirlComment(int comment_child_id);
}

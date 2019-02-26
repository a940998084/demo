package com.piaoniu.demo.service;

import com.piaoniu.demo.model.CommentModel;
import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.CommentChild;
import com.piaoniu.demo.pojo.Show;

import java.util.List;

public interface CommentService {
    //根据演出id查看演出评分和评分人数
    List<Show> findShowById(Integer show_id);
    //根据评论副id查看该评论的回复评论
    List<CommentModel> findCommentByChildId(Integer comment_next_id);
    //修改演出评分
    int updateShowGrade(Show show);
    //添加评论
    int insertComment(Comment comment);
    //添加评论回复
    int insertCommentChild(CommentChild commentChild);
    //根据评论id/演出id查看评论
    List<CommentModel> findComment(Comment comment);
}

package com.piaoniu.demo.service;

import com.piaoniu.demo.model.CommentModel;
import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.CommentChild;
import com.piaoniu.demo.pojo.CommentPhoto;
import com.piaoniu.demo.pojo.Show;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentService {
    List<CommentModel> findCommentById(Integer show_id);
    List<CommentModel> findCommentByChildId(Integer comment_next_id);
    List<CommentModel> findAllComment();
    int updateShowGrade(Show show);
    int insertComment(Comment comment);
    int insert(Comment comment);
    //添加评论回复
    int insertCommentChild(CommentChild commentChild);
    //根据评论id查看评论
    List<CommentModel> findComment(Comment comment);
    // 添加图片路径
    int insertPhtotPath(CommentPhoto commentPhoto);
}

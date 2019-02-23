package com.piaoniu.demo.service;

import com.piaoniu.demo.model.CommentModel;
import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.Show;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentService {
    List<CommentModel> findComment(Integer show_id);
    int updateShowGrade(Show show);
    int insertComment(Comment comment);
}

package com.piaoniu.demo.dao;

import com.piaoniu.demo.model.CommentModel;
import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.Show;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao {
    //根据演出id查看全部评论
    List<CommentModel> findComment(Integer show_id);

    //添加评论
    int insertComment(Comment comment);

    //修改演出评分
    int updateShowGrade(Show show);
}

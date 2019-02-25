package com.piaoniu.demo.dao;

import com.piaoniu.demo.model.CommentModel;
import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.CommentChild;
import com.piaoniu.demo.pojo.CommentPhoto;
import com.piaoniu.demo.pojo.Show;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao {

    //查看全部评论
    List<CommentModel> findAllComment();

    //根据演出id查看全部评论
    List<CommentModel> findCommentById(Integer show_id);

    //根据评论副id查看该评论的回复评论
    List<CommentModel> findCommentByChildId(Integer comment_id);

    //根据评论id查看评论
    List<CommentModel> findComment(Comment comment);

    //添加评论
    int insertComment(Comment comment);

    //修改演出评分
    int updateShowGrade(Show show);

    int insert(Comment comment);

    //添加评论回复
    int insertCommentChild(CommentChild commentChild);

    // 添加图片路径
    int insertPhtotPath(CommentPhoto commentPhoto);
}

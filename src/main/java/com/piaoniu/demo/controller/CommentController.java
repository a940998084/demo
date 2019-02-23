package com.piaoniu.demo.controller;

import com.piaoniu.demo.model.CommentModel;
import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.service.CommentService;
import com.piaoniu.demo.service.impl.CommentServiceImpl;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@RestController
public class CommentController {
    @Resource
    CommentServiceImpl commentService;

    @RequestMapping(value = "/allcomment",method = RequestMethod.GET)
    @ApiOperation(value="获取所有评论", notes="获取所有评论")
    public Json findComment(Model model, Integer show_id){
//        model.addAttribute("find",commentService.findComment(show_id));
        if (commentService.findComment(show_id)!=null){
            return Status.getStatus(0,commentService.findComment(show_id));
        }else {
            return Status.getStatus(1);
        }
    }

    @RequestMapping(value = "/li",method = RequestMethod.GET)
    @ApiOperation(value=" 添加", notes="添加")
    public Json insert(Comment comment){
        return Status.getStatus(0,commentService.insertComment(comment));
    }

    @RequestMapping(value = "/la",method = RequestMethod.GET)
    @ApiOperation(value=" 修改", notes="修改")
    public Json update(Integer show_id,Comment comment){
        List<CommentModel> commentModelList=commentService.findComment(show_id);
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
            show.setShow_comment_grade(d);
            commentService.updateShowGrade(show );
        }
        return Status.getStatus(0);
    }

    @RequestMapping(value = "/addcomment",method = RequestMethod.GET)
    @ApiOperation(value="添加评论", notes="添加评论")
    public Json addComment(Model model,Integer show_id,Comment comment){
        commentService.insertComment(comment);
        List<CommentModel> commentModelList=commentService.findComment(show_id);
        Iterator iterator=commentModelList.iterator();
        while (iterator.hasNext()){
             CommentModel commentModel1=(CommentModel) iterator.next();
             double a=commentModel1.getShow_comment_grade();
             int b=commentModel1.getShow_comment_num();
             double c=comment.getComment_grade();
             double d=(a*b+c)/(b+1);
             Show show=new Show();
             show.setShow_id(show_id);
             show.setShow_comment_grade(d);
             commentService.updateShowGrade(show );
        }
       return Status.getStatus(0);
    }
}

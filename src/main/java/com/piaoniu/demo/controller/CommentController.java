package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.CommentChild;
import com.piaoniu.demo.service.impl.CommentServiceImpl;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/comment")
@RestController
public class CommentController {
    @Resource
    CommentServiceImpl commentService;

    @RequestMapping(value = "/allComment",method = RequestMethod.GET)
    @ApiOperation(value="获取所有评论", notes="获取所有评论")
    public Json findAllComment(Model model,Comment comment){
//        model.addAttribute("find",commentService.findComment(show_id));
        if (commentService.findComment(comment)!=null){
            return Status.getStatus(0,commentService.findComment(comment));
        }else {
            return Status.getStatus(1);
        }
    }

    @RequestMapping(value = "/allCommentById",method = RequestMethod.GET)
    @ApiOperation(value="根据演出id获取所有评论", notes="根据演出id获取所有评论")
    public Json findCommentById(Comment comment){
//        model.addAttribute("find",commentService.findComment(show_id));
        if (commentService.findComment(comment)!=null){
            return Status.getStatus(0,commentService.findComment(comment));
        }else {
            return Status.getStatus(1);
        }
    }

    @RequestMapping(value = "/findcommentParent",method = RequestMethod.GET)
    @ApiOperation(value="根据评论id获取评论", notes="根据评论id获取评论")
    public Json findCommentByParentId(Model model,Comment comment){
//        model.addAttribute("find",commentService.findComment(show_id));
        if (commentService.findComment(comment)!=null){
            return Status.getStatus(0,commentService.findComment(comment));
        }else {
            return Status.getStatus(1);
        }
    }

    @RequestMapping(value = "/findcommentChild",method = RequestMethod.GET)
    @ApiOperation(value="根据评论副id获取所有评论回复", notes="根据评论副id获取所有评论回复")
    public Json findCommentByChildId(Model model, Integer comment_id){
//        model.addAttribute("find",commentService.findComment(show_id));
        if (commentService.findCommentByChildId(comment_id)!=null){
            return Status.getStatus(0,commentService.findCommentByChildId(comment_id));
        }else {
            return Status.getStatus(1);
        }
    }


    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    @ApiOperation(value="添加评论", notes="添加评论")
    public Json addComment( Comment comment,@ApiParam("files")MultipartFile files) throws InterruptedException, IOException {
        commentService.insetpath(files,comment);
        /*commentService.insetpath(files, comment);*/
        System.out.println(comment.getShow_id());
        commentService.updateService(comment);
        return Status.getStatus(0);
    }
    @RequestMapping(value = "/addCommentChild",method = RequestMethod.GET)
    @ApiOperation(value="添加评论回复", notes="添加评论回复")
    public Json addCommentChild(Integer comment_id,CommentChild commentChild){
        Date date=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String a=df.format(date);
        commentChild.setComment_creat_time(a);
        commentChild.setComment_parent_id(comment_id);
        return Status.getStatus(0,commentService.insertCommentChild(commentChild));
    }

}

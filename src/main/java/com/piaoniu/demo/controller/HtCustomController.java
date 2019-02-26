package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.Comment;
import com.piaoniu.demo.pojo.CommentChild;
import com.piaoniu.demo.pojo.Order;
import com.piaoniu.demo.pojo.User;
import com.piaoniu.demo.service.HtCommentService;
import com.piaoniu.demo.service.HtOrderService;
import com.piaoniu.demo.service.HtUserService;
import com.piaoniu.demo.util.PageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "后台客服管理",tags = "后台客服管理操作接口")
public class HtCustomController{
    @Autowired
    private HtOrderService orderService;
    @Autowired
    private HtUserService userService;
    @Autowired
    private HtCommentService commentService;

    @GetMapping("/ht_user_selectAll")
    @ApiOperation(value = "查询展示用户信息",notes = "查询展示用户信息")
    public List<User> findAllUserInfo(){
        return userService.findAllUserInfo();
    }
    @PostMapping("/ht_order_selectBy")
    @ApiOperation(value = "按要求查看订单信息",notes = "按要求查看订单信息")
    public List<Order> SelectAllBy(Order order){
        return orderService.SelectOrderInfoByCondition(order);
    }

    @GetMapping("/ht_order_select")
    @ApiOperation(value = "查询全部订单信息",notes = "查询全部订单信息")
    public List<Order> SelectAll(Integer pageNo){
        PageBean<Order> pageBean=new PageBean<>(orderService.findAllOrderInfo(),15);
        return pageBean.getObjects(pageNo);
    }

    @GetMapping("/ht_comment_selectAll")
    @ApiOperation(value = "查询全部评论",notes = "查询展示全部评论")
    public List<Comment> findAllComment(){
        return commentService.findAllCommentInfo();
    }
    @GetMapping("/ht_comment_select")
    @ApiOperation(value = "查询评论回复",notes = "查询展示评论回复")
    public List<CommentChild> findAllCommentChild(){
        return commentService.findAllChildCommentInfo();
    }
    @GetMapping("/ht_comment_deleteBy")
    @ApiOperation(value = "删除评论",notes = "通过ID删除评论")
    public int deleteByCommentId(int comment_id){
        int a=this.deleteByCommentChildId(comment_id);
        return commentService.deleteComment(comment_id);
    }
    @GetMapping("/ht_comment_delete")
    @ApiOperation(value = "删除评论回复",notes = "通过ID删除评论回复")
    public int deleteByCommentChildId(int comment_child_id){
        return commentService.deleteChirlComment(comment_child_id);
    }
}

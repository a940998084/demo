package com.piaoniu.demo.controller;


import com.piaoniu.demo.model.User_CouponModel;
import com.piaoniu.demo.pojo.Discount;
import com.piaoniu.demo.service.impl.User_CouponServiceImpl;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "discount")
public class User_CouponController {
    @Resource
    User_CouponServiceImpl user_couponService;

    //新增优惠券
    @RequestMapping(value = "user/add/coupon",method = RequestMethod.GET)
    @ApiOperation(value = "新增优惠券",notes="新增优惠券")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public int tianjia(int user_id){
        Discount discount=new Discount();
        discount.setUser_id(user_id);
        return user_couponService.shengchengyouhuiquan(discount);
    }

    //@RequestMapping(value = "update/coupon/status",method = RequestMethod.GET)
    //@ApiOperation(value = "修改优惠券状态1",notes="修改优惠券状态1")
    @Scheduled(cron = "0 55 16 * * ?") // [秒] [分] [小时] [日] [月] [周] [年]
    public Json userDiscountUpdate(){
       user_couponService.xiugaizhuangtai();
        return Status.getStatus(0);
    }

    @RequestMapping(value = "user/select/coupon",method = RequestMethod.GET)
    @ApiOperation(value = "查询优惠券",notes="查询优惠券")
    public Json couponList(int user_id, int discount_status_id) {
        User_CouponModel user_couponModel=new User_CouponModel();
        user_couponModel.setUser_id(user_id);
        user_couponModel.setDiscount_status_id(discount_status_id);
        List<User_CouponModel>list=user_couponService.userDiscountList(user_couponModel);
        System.out.println(list.size());
        if (list!=null){
            return Status.getStatus(0,list);
        }else {
            return Status.getStatus(1);
        }
    }

    @RequestMapping(value = "user/update/coupon",method = RequestMethod.GET)
    @ApiOperation(value = "使用后修改优惠券状态",notes="使用后修改优惠券状态")
    public Json userDiscountUpdate2(Integer user_id, Integer discount_id){
        Discount discount=new Discount();
        discount.setUser_id(user_id);
        discount.setDiscount_id(discount_id);
        int i=user_couponService.xiugaizhuangtai2(discount);
        if (i<0){
            return Status.getStatus(0);
        }else {
            return Status.getStatus(0);
        }
    }

    @RequestMapping(value = "user/select/dingdan/coupon",method = RequestMethod.GET)
    @ApiOperation(value = "用户买演出票时，遍历对应的优惠券",notes="用户买演出票时，遍历对应的优惠券")
    public Json duiyingDiscount(Integer user_id, Integer show_type_id){
        List<Discount> duiyingDiscountList=user_couponService.duiyingDiscount(user_id,show_type_id);
        if (duiyingDiscountList.size()<=0){
            return Status.getStatus(1,"没有对应优惠券");
        }else {
            return Status.getStatus(0,duiyingDiscountList);
        }
    }


}

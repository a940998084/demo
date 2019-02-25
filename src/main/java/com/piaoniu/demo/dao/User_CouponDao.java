package com.piaoniu.demo.dao;


import com.piaoniu.demo.model.User_CouponModel;
import com.piaoniu.demo.pojo.Discount;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User_CouponDao {

    //添加优惠券
    int shengchengyouhuiquan(Discount discount);

    //查询优惠券状态为1的优惠券
    List<Discount>youhuiquanwei1();

    //修改优惠券的状态
    int xiugaizhuangtai(Discount discount);

    //根据优惠券状态id和用户id查询某用户的优惠券
    List<User_CouponModel>userDiscountList(User_CouponModel user_couponModel);

    //使用优惠券以后修改状态
    int xiugaizhuangtai2(Discount discount);

    //下订单时查询对应优惠券（根据用户id和演出类型id查询优惠券，要与下订单时某类型的演出对应某类型的优惠券）
    List<Discount> duiyingDiscount(Integer user_id,Integer show_type_id);

}

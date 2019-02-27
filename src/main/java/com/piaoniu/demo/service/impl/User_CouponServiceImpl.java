package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.User_CouponDao;
import com.piaoniu.demo.model.User_CouponModel;
import com.piaoniu.demo.pojo.Discount;
import com.piaoniu.demo.service.User_CouponService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class User_CouponServiceImpl implements User_CouponService {
    @Resource
    User_CouponDao user_couponDao;

    @Override
    public int shengchengyouhuiquan(Discount discount) {
        int s = 0;
        for (int i = 1; i <= 8; i++) {
            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String xianzaiTime = df.format(date);//当前日期
            String end = df.format(new Date(date.getTime() + (long) 30 * 24 * 60 * 60 * 1000));//一个月以后的时间
            discount.setDiscount_begin(xianzaiTime);
            discount.setDiscount_end(end);
            discount.setShow_type_id(i);
            discount.setDiscount_money(20);
            discount.setDiscount_name("立减20元");
            user_couponDao.shengchengyouhuiquan(discount);
            s++;
        }
        return s;
    }

    @Override
    public List<User_CouponModel> userDiscountList(User_CouponModel user_couponModel) {
        return user_couponDao.userDiscountList(user_couponModel);
    }

    @Override
    public int xiugaizhuangtai2(Discount discount) {
        return user_couponDao.xiugaizhuangtai2(discount);
    }

    @Override
    public List<Discount> duiyingDiscount(Integer user_id, Integer show_type_id) {
        return user_couponDao.duiyingDiscount(user_id,show_type_id);
    }


    @Override
    public List<Discount> youhuiquanwei1() {
        return user_couponDao.youhuiquanwei1();
    }

    @Override
    public void xiugaizhuangtai() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        List<Discount> list = user_couponDao.youhuiquanwei1();
        for (int i = 0; i < list.size(); i++) {
            try {
                Long end = sf.parse(list.get(i).getDiscount_end()).getTime();
                Long xianzaiTime = sf.parse(sf.format(new Date())).getTime();
                if (end < xianzaiTime) {
                    user_couponDao.xiugaizhuangtai(list.get(i));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

    }

}

package com.piaoniu.demo.dao;

import com.piaoniu.demo.model.Order2;
import com.piaoniu.demo.pojo.Address;
import com.piaoniu.demo.pojo.Discount;
import com.piaoniu.demo.pojo.Order;
import com.piaoniu.demo.model.Order1;

import com.piaoniu.demo.pojo.Pnlog;
import org.springframework.stereotype.Repository;
import sun.rmi.runtime.Log;

import java.util.List;

@Repository
public interface OrderDao {


    /**
     * 根据订单的状态遍历订单
     * 待支付 1    待出票  2   待收货 3
     * 已完成 4   已取消 5   已退款  6
     */
    List<Order1> selectByUserAndStatus(Order1 order1);



    /**
     *
     * 遍历所有的订单
     */
    List<Order1> selectAll(Order1 order1) ;

    /**
     * 取消订单(修改订单额状态)
     */
    int updateStatus(Order1 order1);



    /**
     *s生成订单
     */
    int add(Order order);

    /**
     * 查询用户所看演出是不是有对应的优惠券
     */
     List<Discount> selectDiscount(Discount discount);

    /**
     * 订单详情
     */
    List<Order2>  selectOrderDetail(Order2 order2);

    /**
     * 遍历用户的守护地址
     */
    List<Address> selectAddress(Address address);

/**

 String aliPay(AlipayBean alipayBean) throws AlipayApiException;

 /* *
 *  日志生成
 */
    int insetlog(Pnlog pnlog) ;


    /**
     * 日志查看
     */
   List<Pnlog>  selectLog();

  /*  @Autowired
    private RedisTemplate<String,String> redisTemplate;
    // redis中保存单个对象
    public void add(String key, Department department ,Long time){
        Gson gson=new Gson();
        redisTemplate.opsForValue().set(key,gson.toJson(department),time,TimeUnit.MINUTES);
    }
    //保存list集合
    public void add(String key, List<Department> department , Long time){
        Gson gson=new Gson();
        redisTemplate.opsForValue().set(key,gson.toJson(department),time,TimeUnit.MINUTES);
    }

    //使用get获取单个对象
    public Department get(String key){
        String department= redisTemplate.opsForValue().get(key);
        //将json字符串转化为实体对象
        Gson gson=new Gson();
        return gson.fromJson(department,Department.class);

    }
    //使用get获取对象集合
    public  List<Department> getlist(String key){
        String department= redisTemplate.opsForValue().get(key);
        //将json字符串转化为实体对象的集合
        Gson gson=new Gson();
        List<Department> list=gson.fromJson(department,new TypeToken<List<Department>>(){}.getType());
        return list;
    }
    //根据key值进行删除
    public void delete(String key){
        redisTemplate.opsForValue().getOperations().delete(key);
    }
}*/




}

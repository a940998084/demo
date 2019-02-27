package com.piaoniu.demo.service;

import com.piaoniu.demo.model.GuanzhuModel;
import com.piaoniu.demo.pojo.Like;
import com.piaoniu.demo.pojo.Show;

import java.util.List;

public interface UserService {

    //获取关注
    List<GuanzhuModel> guanzhu(GuanzhuModel guanzhuModel);

    //修改关注的状态
    int xiugaizhuangtai(Integer show_id);

    //取消关注
    int quxiaoguanzhu(Integer like_id);

    //查询某用户所有关注
    List<GuanzhuModel> guanzhuList(Integer user_id);

    //修改关注量
    int xiugaiguanzhuliang (GuanzhuModel model);

    //添加关注
    int tianjiaguanzhu(Like like);

    //通过user_id和show_id查询关注表数据，用于判断是否已经关注
    List<Like> likeList(Like like);

    //通过show_id查询关注量
    List<Show>guanzhuliang(Integer show_id);

}

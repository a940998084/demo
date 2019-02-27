package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.service.AdShowService;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "adshow")
public class AdShowController {

    @Resource
    private AdShowService adShowService;

    @RequestMapping(value = "/selectshow",method = RequestMethod.GET)
    @ApiOperation(value = "查看全部演出",notes="查看全部演出")
    public List<Show> selectshow(Model model){
        List<Show> list = adShowService.selectshow();
        model.addAttribute("show",list);
        return list;
    }

    @RequestMapping(value = "/insertshow",method = RequestMethod.GET)
    @ApiOperation(value = "添加演出",notes="添加演出")
    public int insertshow(Show show){

        int i = adShowService.insertshow(show);
        if (i>0){
            return 0;
        }
        return 1;

    }
    @RequestMapping(value = "/updateshow",method = RequestMethod.GET)
    @ApiOperation(value = "修改演出信息",notes="修改演出信息")
    public int updateshow(Show show){

        int i = adShowService.updateshow(show);
        if (i>0){
            return 0;
        }
        return 1;
    }

    @RequestMapping(value = "/delshow",method = RequestMethod.GET)
    @ApiOperation(value = "删除演出信息",notes="删除演出信息")
    public int delshow(Show show){

        int i = adShowService.delshow(show);
        if (i>0){
            return 0;
        }
        return 1;
    }

}

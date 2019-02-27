package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.City;
import com.piaoniu.demo.pojo.Hall;
import com.piaoniu.demo.pojo.ShowPlace;
import com.piaoniu.demo.service.AdCityService;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "adcity")
public class AdCityController {

    @Resource
    private AdCityService adCityService;

    @RequestMapping(value = "/insertcity",method = RequestMethod.GET)
    @ApiOperation(value = "添加城市",notes="添加城市")
    public int insertcity(City city){
        int i = adCityService.insertcity(city);
        if (i>0){
            return 0;
        }
        return 1;
    }
    @RequestMapping(value = "/delcity",method = RequestMethod.GET)
    @ApiOperation(value = "删除城市",notes="删除城市")
    public int delcity(City city){
        int i = adCityService.delcity(city);
        if (i>0){
            return 0;
        }
        return 1;
    }

    @RequestMapping(value = "/selectcity" , method = RequestMethod.GET)
    @ApiOperation(value = "查看全部城市",notes="查看全部城市")
    public List<City> select(Model model){

        List<City> list = adCityService.selectcity();
        model.addAttribute("city",list);
        return list;
    }


    //场馆管理

    @RequestMapping(value = "/insertbycity",method = RequestMethod.GET)
    @ApiOperation(value = "给城市添加场馆",notes="给城市添加场馆")
    public int insertbycity(ShowPlace showPlace){
        int i = adCityService.insertshowplace(showPlace);
        if (i>0){
            return 0;
        }
        return 1;
    }
    @RequestMapping(value = "/delshowplace",method = RequestMethod.GET)
    @ApiOperation(value = "删除场馆",notes="删除场馆")
    public int delshowplace(ShowPlace showPlace){
        int i = adCityService.delshowplace(showPlace);
        if (i>0){
            return 0;
        }
        return 1;
    }

    @RequestMapping(value = "/selectbycity" , method = RequestMethod.GET)
    @ApiOperation(value = "根据城市查看场馆",notes="根据城市查看场馆")
    public List<ShowPlace> selectbycity(Model model,Integer city_id){

        List<ShowPlace> list = adCityService.selectbycity(city_id);
        model.addAttribute("showplace",list);
        return list;
    }

    //演厅管理
    @RequestMapping(value = "/inserthall",method = RequestMethod.GET)
    @ApiOperation(value = "给场馆添加演厅",notes="给场馆添加演厅")
    public int inserthall(Hall hall){
        int i = adCityService.inserthall(hall);
        if (i>0){
            return 0;
        }
        return 1;
    }
    @RequestMapping(value = "/updatehall",method = RequestMethod.GET)
    @ApiOperation(value = "修改演厅",notes="修改演厅")
    public int updatehall(Hall hall){
        int i = adCityService.updatehall(hall);
        if (i>0){
            return 0;
        }
        return 1;
    }
    @RequestMapping(value = "/delhall",method = RequestMethod.GET)
    @ApiOperation(value = "删除演厅",notes="删除演厅")
    public int delhall(Hall hall){
        int i = adCityService.delhall(hall);
        if (i>0){
            return 0;
        }
        return 1;
    }

    @RequestMapping(value = "/selecthall" , method = RequestMethod.GET)
    @ApiOperation(value = "根据场馆查看演厅",notes="根据场馆查看演厅")
    public List<Hall> selecthall(Model model,Integer hall_id){

        List<Hall> list = adCityService.selecthall(hall_id);
        model.addAttribute("hall",list);
        return list;
    }


}

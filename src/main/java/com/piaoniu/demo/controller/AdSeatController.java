package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.Hall;
import com.piaoniu.demo.pojo.Seat;
import com.piaoniu.demo.service.AdSeatService;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "adseat")
public class AdSeatController {
    @Resource
    private AdSeatService adSeatService;

    @RequestMapping(value = "/insertseat",method = RequestMethod.GET)
    @ApiOperation(value = "演厅添加座位",notes="演厅添加座位")
    public int insertseat(Seat seat){
        int i = adSeatService.insertseat(seat);
        if (i>0){
            return 0;
        }
        return 1;
    }
    @RequestMapping(value = "/updateseat",method = RequestMethod.GET)
    @ApiOperation(value = "修改演厅座位",notes="修改演厅座位")
    public int updateseat(Seat seat){
        int i = adSeatService.updateseat(seat);
        if (i>0){
            return 0;
        }
        return 1;
    }
    @RequestMapping(value = "/delhall",method = RequestMethod.GET)
    @ApiOperation(value = "删除演厅座位",notes="删除演厅座位")
    public int delseat(Seat seat){
        int i = adSeatService.delseat(seat);
        if (i>0){
            return 0;
        }
        return 1;
    }

    @RequestMapping(value = "/selectseat" , method = RequestMethod.GET)
    @ApiOperation(value = "根据演厅查看座位",notes="根据演厅查看座位")
    public List<Seat> selectseat(Model model, Integer hall_id){

        List<Seat> list = adSeatService.selectseat(hall_id);
        model.addAttribute("seat",list);
        return list;
    }


}

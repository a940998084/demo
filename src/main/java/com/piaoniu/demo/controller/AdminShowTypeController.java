package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.ShowType;
import com.piaoniu.demo.service.AdminService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "admin")
public class AdminShowTypeController {

    @Resource
    private AdminService adminService;


    @RequestMapping(value = "/addshowType",method = RequestMethod.GET)
    @ApiOperation(value = "增加演出类型",notes="增加演出类型")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),
            @ApiResponse(code = 0,message = "操作失败"),
            @ApiResponse(code = 3,message = "权限不足")})
    public int addshowType(String show_type){
        ShowType showType = new ShowType();
        showType.setShow_type(show_type);
        int i=adminService.addshowType(showType);
        if (i>0){
            return 0;
        }
        return 1;
    }

    @RequestMapping(value = "/select" , method = RequestMethod.GET)
    @ApiOperation(value = "查看全部演出类型",notes="查看全部演出类型")
    public List<ShowType> select(Model model){

        List<ShowType> list = adminService.select();
        model.addAttribute("showType",list);
        return list;
    }

    @RequestMapping(value = "/updateshowType",method = RequestMethod.GET)
    @ApiOperation(value = "根据类型编号修改演出类型",notes="根据类型编号修改演出类型")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),
            @ApiResponse(code = 0,message = "操作失败"),
            @ApiResponse(code = 3,message = "权限不足")})
    public int updateshowType(ShowType showType){
        int i = adminService.updateshowType(showType);
        if (i>0){
            return 0;
        }
        return 1;
    }
    @RequestMapping(value = "/delshowType",method = RequestMethod.GET)
    @ApiOperation(value = "根据类型编号演删除出类型",notes="根据类型编号删除演出类型")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),
            @ApiResponse(code = 0,message = "操作失败"),
            @ApiResponse(code = 3,message = "权限不足")})
    public int delshowType(ShowType showType){
        int i = adminService.delshowType(showType);
        if (i>0){
            return 0;
        }
        return 1;
    }

}

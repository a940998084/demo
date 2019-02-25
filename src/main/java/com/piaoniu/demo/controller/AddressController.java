package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.Address;
import com.piaoniu.demo.service.AddressService;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @RequestMapping(value = "SelectAddress1",method = RequestMethod.GET)
    @ApiOperation(value = "遍历地址信息",notes="遍历地址信息")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser(int user_id) {
        if(addressService.SelectByUid(user_id)!=null){
            return Status.getStatus(0,addressService.SelectByUid(user_id));
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "DeleteByAid",method = RequestMethod.GET)
    @ApiOperation(value = "删除地址信息",notes="删除地址信息")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser1(int address_id) {
        if(addressService.DeleteByAid(address_id)>0){
            return Status.getStatus(0,"删除成功");
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "SelectAddress2",method = RequestMethod.GET)
    @ApiOperation(value = "添加地址信息",notes="添加地址信息")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser2(Address address) {
        addressService.insertAddress(address);
        this.getUser(address.getUser_id());
        return Status.getStatus(0,"添加成功");
    }
}

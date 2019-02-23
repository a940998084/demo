package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.Seat;
import com.piaoniu.demo.service.IndexService;
import com.piaoniu.demo.service.TicketService;
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
@RequestMapping(value = "ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;
    @RequestMapping(value = "SelectShowtimeByShowname",method = RequestMethod.GET)
    @ApiOperation(value = "根据演出名称查询场次",notes="根据演出名称查询场次")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser(String show_name) {
        if(ticketService.SelectCCBySid(show_name)!=null){
            return Status.getStatus(0,ticketService.SelectCCBySid(show_name));
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "SelectHallByShowid",method = RequestMethod.GET)
    @ApiOperation(value = "根据演出id查询展厅",notes="根据演出名称查询场次")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser1(int show_id) {
        if(ticketService.SelectZTBySid(show_id)!=null){
            return Status.getStatus(0,ticketService.SelectZTBySid(show_id));
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "SelectSeatByHall",method = RequestMethod.GET)
    @ApiOperation(value = "根据演厅id查询座位信息",notes="根据演厅id查询座位信息")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser2(int hall_id) {
        if(ticketService.SelectSeatByHall(hall_id)!=null){
            return Status.getStatus(0,ticketService.SelectSeatByHall(hall_id));
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "UpdateSeatStatus",method = RequestMethod.GET)
    @ApiOperation(value = "修改座位状态",notes="修改座位状态")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser3(int seat_id) {
        if(ticketService.UpdateSeatStatus(seat_id)>0){
            return Status.getStatus(0,ticketService.UpdateSeatStatus(seat_id));
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "SelectSeatMoney",method = RequestMethod.GET)
    @ApiOperation(value = "查询票档",notes="查询飘荡")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser4(int show_id) {
        if(ticketService.SelectSeatMoney(show_id)!=null){
            return Status.getStatus(0,ticketService.SelectSeatMoney(show_id));
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "SelectSeatByMoneyAndSid",method = RequestMethod.GET)
    @ApiOperation(value = "判断余票",notes="判断余票")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser5(Seat seat) {
        if(ticketService.SelectSeatByMoneyAndSid(seat)!=null){
            return Status.getStatus(0,ticketService.SelectSeatByMoneyAndSid(seat));
        }else {
            return Status.getStatus(1);
        }
    }
}

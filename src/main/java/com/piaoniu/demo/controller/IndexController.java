package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.service.IndexService;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "index")
public class IndexController {
    @Autowired
    IndexService indexService;
    @RequestMapping(value = "selectShowType",method = RequestMethod.GET)
    @ApiOperation(value = "遍历演出类型",notes="遍历演出类型")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser() {
        if(indexService.findShowtype()!=null){
            return Status.getStatus(0,indexService.findShowtype());
        }else {
            return Status.getStatus(1);
        }
    }
    @RequestMapping(value = "selectShowByAll",method = RequestMethod.GET)
    @ApiOperation(value = "根据大量条件遍历演出",notes="根据大量条件遍历演出")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser1(@ModelAttribute Show show) {
        if(indexService.findShowByAll(show)!=null){
            return Status.getStatus(0,indexService.findShowByAll(show));
        }else {
            return Status.getStatus(1);
        }
    }
}

package com.piaoniu.demo.controller;

import com.piaoniu.demo.pojo.VeryScene;
import com.piaoniu.demo.service.impl.VerySceneServiceImpl;
import com.piaoniu.demo.util.Json;
import com.piaoniu.demo.util.Status;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class VerySceneController {
    @Resource
    VerySceneServiceImpl verySceneService;

    @RequestMapping(value = "/findVeryScene",method = RequestMethod.GET)
    @ApiOperation(value="查看十分现场", notes="查看十分现场")
    public Json findVeryScene(){
        return Status.getStatus(0,verySceneService.selectVeryScene());
    }
}

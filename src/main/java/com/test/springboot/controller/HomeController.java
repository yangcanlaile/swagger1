package com.test.springboot.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

@Api(tags="个人业务")
public class HomeController {

    @ApiOperation(value="登陆", notes="根据url的id来获取用户详细信息")
    @RequestMapping(value= "/home", method=RequestMethod.GET)
    public String login(){
        return "test2";


    }

}

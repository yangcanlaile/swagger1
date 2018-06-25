package com.test.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @ApiOperation(value="登陆", httpMethod = "GET")
    @RequestMapping(value= "/home", method=RequestMethod.GET)
    public String login(){

        return "test2";
    }

}

package com.test.springboot.controller;

import com.test.springboot.bean.User;
import com.test.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping({"/user"})

public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/user")

    @ResponseBody

    public String getUserInfoByName(String name) {

        User user = userMapper.findUserByName(name).get(0);

        return user.getName() + "-----" + user.getAge();

    }

}




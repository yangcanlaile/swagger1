package com.test.springboot.controller;

import com.test.springboot.bean.User;
import com.test.springboot.service.IUserService;
import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@ComponentScan({"com.test.springboot.service"})
@MapperScan("com.test.springboot.mapper")
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);

    @Resource
    private IUserService userService;

    @RequestMapping("/say")
    public String say(){
        return "springboot-a"+userService;
    }

    @RequestMapping("/find")
    public String find(){
        logger.info("This is info");
        logger.debug("This is debugs");
        logger.warn("This is warns");


        User user =  userService.find(1);
        ModelAndView mav = new ModelAndView();
        mav.addObject("user","sadf");
        return "HelloWord"+"fasdf--"+user.getUsername()+"--"+user.getPassword();
    }


    @RequestMapping("/ajax")
    public String find1(){
        return "[''message':'123dfx']";
    }

//    public static void main(String[] args){
//        SpringApplication.run(UserController.class,args);
//    }
}

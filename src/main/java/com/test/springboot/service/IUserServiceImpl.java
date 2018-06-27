package com.test.springboot.service;

import com.test.springboot.bean.User;
import com.test.springboot.mapper.UserMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@ComponentScan("com.test.springboot.mapper")
@Service("userService")
public class IUserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User find(int id) {
        return userMapper.find(id);
    }

    @Override
    public void delete(int id) {
        userMapper.delete(id);
    }
}

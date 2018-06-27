package com.test.springboot.service;

import com.test.springboot.bean.User;

public interface IUserService {


    public void insert(User user);

    public void update(User user);

    public User find(int id);

    public void delete(int id);
}

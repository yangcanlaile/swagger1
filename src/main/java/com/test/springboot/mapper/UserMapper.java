package com.test.springboot.mapper;

import com.test.springboot.bean.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    public void insert(User user);

    public void update(User user);

    public void delete(int id);

    public User find(int id);
}
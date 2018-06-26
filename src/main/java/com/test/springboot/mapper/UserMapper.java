package com.test.springboot.mapper;

import com.test.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user where name  = #{name}")
    List<User> findUserByName(String name);

}
package com.wzh.service;

import com.wzh.mapper.UserMapper;
import com.wzh.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}

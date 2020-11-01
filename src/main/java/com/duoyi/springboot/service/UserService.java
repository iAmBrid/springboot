package com.duoyi.springboot.service;

import com.duoyi.springboot.entity.User;
import com.duoyi.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        List<User> userList = userMapper.findAll();
        return userList;
    }
}

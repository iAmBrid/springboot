package com.duoyi.springboot.service;

import com.duoyi.springboot.entity.User;
import com.duoyi.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> searchAllUser(){
        List<User> userList = userMapper.searchAllUser();
        return userList;
    }

    public User searchUserById(int id){
        User user = userMapper.searchUserById(id);
        return user;
    }

    public Map addUser(User user){
        Map<String,Object> map = new HashMap<>();
        try{
            if (userMapper.addUser(user) > 0){
                map.put("success",true);
                map.put("message","插入成功");
            }else{
                map.put("success",false);
                map.put("message","插入失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            map.put("success",false);
            map.put("message","插入失败");
        }
        return map;
    }

    public Map updateUser(User user){
        Map<String,Object> map = new HashMap<>();
        try{
            if (userMapper.updateUser(user) > 0){
                map.put("success",true);
                map.put("message","更新成功");
            }else{
                map.put("success",false);
                map.put("message","更新失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            map.put("success",false);
            map.put("message","更新失败");
        }
        return map;
    }

    public Map deleteUser(User user){
        Map<String,Object> map = new HashMap<>();
        try{
            if (userMapper.deleteUser(user) > 0){
                map.put("success",true);
                map.put("message","删除成功");
            }else{
                map.put("success",false);
                map.put("message","删除失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            map.put("success",false);
            map.put("message","删除失败");
        }
        return map;
    }
}

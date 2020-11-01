package com.duoyi.springboot.mapper;

import com.duoyi.springboot.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> searchAllUser();

    @Select("select * from user where id=#{id}")
    User searchUserById(int id);

    @Insert("insert into user(username,password) values(#{username},#{password})")
    int addUser(User user);

    @Update("update user set username=#{username},password=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where username=#{username} and password=#{password}")
    int deleteUser(User user);
}

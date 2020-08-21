package com.wyp.java8.service;

import com.wyp.java8.mapper.UserMapper;
import com.wyp.java8.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public List<User> getAllUser(){
        return userMapper.getAll();
    }

    public int insert(User user){
        return userMapper.insert(user);
    }

}

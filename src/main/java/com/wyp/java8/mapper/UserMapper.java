package com.wyp.java8.mapper;

import com.wyp.java8.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    int insert(User user);

    List<User> getAll();



}

package com.wyp.java8.controller;

import com.wyp.java8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/user/list")
    public List getUserList(){
        return userService.getAllUser();
    }





}

package com.wyp.java8;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.wyp.java8.model.User;
import com.wyp.java8.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Java8Application.class)
@WebAppConfiguration
public class Java8ApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
    }


    @Test
    public void getUserListTest(){
        userService.getAllUser().forEach(
                (row)-> System.out.println(row.toString())
        );
    }

    public void insertTest(){
        User user = new User();

    }



}

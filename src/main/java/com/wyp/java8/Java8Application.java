package com.wyp.java8;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wyp.java8.mapper")
public class Java8Application {

    public static void main(String[] args) {
        SpringApplication.run(Java8Application.class, args);
    }

}

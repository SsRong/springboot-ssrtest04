package com.ssrtest04.controller;

import com.ssrtest04.test01.service.UserServiceTest01;
import com.ssrtest04.test02.service.UserServiceTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisMultilDatasourceController {

    @Autowired
    private UserServiceTest01 userServiceTest01;
    @Autowired
    private UserServiceTest02 userServiceTest02;

    @RequestMapping("/insertUsertest01")
    public Integer insertUsertest01(String name,Integer age){
        return userServiceTest01.insertUser(name,age);
    }
    @RequestMapping("/insertUsertest02")
    public Integer insertUsertest02(String name,Integer age){
        return userServiceTest02.insertUser(name,age);
    }

}

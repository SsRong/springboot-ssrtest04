package com.ssrtest04.test01.service;


import com.ssrtest04.entity.User;

import com.ssrtest04.test01.mapper.UserMapperTest01;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserServiceTest01 {
    @Autowired
    private UserMapperTest01 userMapperTest01;

    @Transactional
    public User select(String name){
        User selectResult = userMapperTest01.findByName(name);
        log.info("#######insertUserResult:{}#############",selectResult);
        return selectResult;
    }

    @Transactional
    public int insertUser(String name,Integer age){
        int insertUserResult = userMapperTest01.insert(name, age);
        int i=1/age;
        log.info("#######insertUserResult:{}#############",insertUserResult);
        return insertUserResult;
    }


}

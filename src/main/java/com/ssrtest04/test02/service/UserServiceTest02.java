package com.ssrtest04.test02.service;


import com.ssrtest04.entity.User;
import com.ssrtest04.test02.mapper.UserMapperTest02;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserServiceTest02 {
    @Autowired
    private UserMapperTest02 userMapperTest02;

    public User select(String name){
        User selectResult = userMapperTest02.findByName(name);
        log.info("#######insertUserResult:{}#############",selectResult);
        return selectResult;
    }

    @Transactional
    public int insertUser(String name,Integer age){
        int insertUserResult = userMapperTest02.insert(name, age);
        int i=1/age;
        log.info("#######insertUserResult:{}#############",insertUserResult);
        return insertUserResult;
    }


}

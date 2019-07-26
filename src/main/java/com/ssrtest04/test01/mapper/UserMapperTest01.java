package com.ssrtest04.test01.mapper;


import com.ssrtest04.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//
public interface UserMapperTest01 {
    //查询语句
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);


    //插入语句
    @Insert("INSERT INTO user(NAME, AGE) VALUES(#{name},#{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}

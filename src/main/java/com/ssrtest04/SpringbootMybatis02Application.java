package com.ssrtest04;

import com.ssrtest04.config.DBConfig1;
import com.ssrtest04.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
public class SpringbootMybatis02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatis02Application.class, args);
    }

}

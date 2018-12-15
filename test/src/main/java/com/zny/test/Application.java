package com.zny.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zny
 * @Date: 2018/12/15 14:14
 * @Description:
 */
@SpringBootApplication
@RestController
public class Application {
    @Value("${server.port}")
    String port;
    @Value("${spring.application.name}")
    String name;
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    @GetMapping("/")
    public String hello(){
        return "hello! by"+name+":"+port;
    }
}

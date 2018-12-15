package com.zny.ribbon;

import com.zny.ribbon.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: zny
 * @Date: 2018/12/15 11:29
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
@RestController
public class Application {
    @Autowired
    HomeService homeService;
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    /**
     * 本地负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
    @GetMapping("/")
    public String hello(){
        return homeService.hello();
    }
}

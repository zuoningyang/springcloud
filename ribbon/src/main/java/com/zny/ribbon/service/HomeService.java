package com.zny.ribbon.service;

import com.zny.ribbon.service.impl.HomeServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: zny
 * @Date: 2018/12/15 14:31
 * @Description:
 */
@Service
@FeignClient(name = "test-mine",fallback = HomeServiceFallback.class)
//Feign 整合了Ribbon
public interface HomeService {
    @GetMapping("/")
    public String hello();
}

package com.zny.ribbon.service.impl;

import com.zny.ribbon.service.HomeService;
import org.springframework.stereotype.Component;

/**
 * @Auther: zny
 * @Date: 2018/12/15 15:59
 * @Description:
 */
@Component
public class HomeServiceFallback implements HomeService {
    @Override
    public String hello() {
        return "hello() is dead";
    }
}

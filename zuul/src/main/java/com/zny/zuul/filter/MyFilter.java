package com.zny.zuul.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @Auther: zny
 * @Date: 2018/12/18 11:32
 * @Description:
 */
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}

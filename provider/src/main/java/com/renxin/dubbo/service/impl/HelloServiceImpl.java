package com.renxin.dubbo.service.impl;

import com.renxin.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String getName(String name) {
        return name;
    }
}

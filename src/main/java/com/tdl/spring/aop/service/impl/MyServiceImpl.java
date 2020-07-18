package com.tdl.spring.aop.service.impl;

import com.tdl.spring.aop.service.MyService;

public class MyServiceImpl implements MyService {
    @Override
    public void myMethod() {
        System.out.println("my method invoke");
    }
}

package com.tdl.spring.aop.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAdvisor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("befor MyAdvisor invoke!");
        Object result =  invocation.proceed();
        System.out.println("after MyAdvisor invoke!");
        return result;
    }
}

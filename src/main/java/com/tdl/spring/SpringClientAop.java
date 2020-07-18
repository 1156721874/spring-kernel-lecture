package com.tdl.spring;

import com.tdl.spring.aop.service.MyService;
import com.tdl.spring.bean.Student;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringClientAop {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext2.xml");
        DefaultListableBeanFactory defaultListableBeanFactory
                = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader =
                new XmlBeanDefinitionReader(defaultListableBeanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);

        MyService myService = (MyService)defaultListableBeanFactory.getBean("myAop");
        myService.myMethod();
        System.out.println(myService.getClass());
        System.out.println(myService.getClass().getSuperclass());
        System.out.println(myService.getClass().getInterfaces().length);
        for( Class tclass : myService.getClass().getInterfaces()){
            System.out.println(tclass.getName());
        }
    }
}

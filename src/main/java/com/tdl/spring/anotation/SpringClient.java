package com.tdl.spring.anotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringClient {
    public static void main(String[] args) {
        //相当于xml方式的工厂，内置了reader和scanner
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext();
        //相当于xml的读取器
        annotationConfigApplicationContext.register(PersonConfiguration.class);
        //刷新工厂
        annotationConfigApplicationContext.refresh();
        PersonConfiguration personConfiguration = (PersonConfiguration)annotationConfigApplicationContext.getBean("personConfiguration");
        Person person = (Person)annotationConfigApplicationContext.getBean("person");
        System.out.println(personConfiguration.getClass());
        System.out.println(person.getClass());
    }
}

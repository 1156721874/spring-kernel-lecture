package com.tdl.spring.anotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfiguration {

    @Bean(name="person")
    public Person getPerson(){
        System.out.println("getPerson invoke!");
        Person  person =  new Person();
        person.setId(222);
        person.setName("kkkk");
        return person;
    }
}

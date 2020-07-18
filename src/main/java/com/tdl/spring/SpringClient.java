package com.tdl.spring;

import com.tdl.spring.bean.Student;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringClient {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        DefaultListableBeanFactory defaultListableBeanFactory
                = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader =
                new XmlBeanDefinitionReader(defaultListableBeanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);

        Student student = defaultListableBeanFactory.getBean("student", Student.class);
        System.out.println(student.getName());
        System.out.println(student.getAge());

    }
}

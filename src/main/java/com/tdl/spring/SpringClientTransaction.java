package com.tdl.spring;

import com.tdl.spring.aop.service.MyService;
import com.tdl.spring.bean.Student;
import com.tdl.spring.service.StudentService;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringClientTransaction {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext3.xml");
        DefaultListableBeanFactory defaultListableBeanFactory
                = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader =
                new XmlBeanDefinitionReader(defaultListableBeanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);

        StudentService studentService = (StudentService)defaultListableBeanFactory.
                getBean("studentServiceProxy");
        Student student  = new Student();
        student.setName("zhangsan");
        student.setAge(23);
        studentService.saveStudent(student);
    }
}

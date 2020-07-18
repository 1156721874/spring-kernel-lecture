package com.tdl.spring.service.impl;

import com.tdl.spring.bean.Student;
import com.tdl.spring.dao.StudentDao;
import com.tdl.spring.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void saveStudent(Student student) {
        this.studentDao.saveStudent(student);
    }
}

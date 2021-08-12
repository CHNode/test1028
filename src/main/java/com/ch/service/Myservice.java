package com.ch.service;

import com.ch.dao.StudentDao;
import com.ch.domain.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Myservice implements StudentService {
    @Resource
    StudentDao studentDao;
    @Override
    public List<Student> findStudent() {
        return studentDao.selectStudents();
    }
}

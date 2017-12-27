package com.dora.service;

import com.dora.dao.StudentDao;
import com.dora.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xingfuwang on 2017/12/27.
 */
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student findByName(String name){
        return studentDao.findByName(name);
    }

    public void save(Student student){
        studentDao.save(student);
    }

    public List<Student> getAll(){
        return (List<Student>) studentDao.findAll();
    }
}

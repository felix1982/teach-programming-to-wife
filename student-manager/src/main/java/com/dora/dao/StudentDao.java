package com.dora.dao;

import com.dora.entity.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by xingfuwang on 2017/12/27.
 */
public interface StudentDao extends CrudRepository<Student,Integer> {
    Student findByName(String name);
}

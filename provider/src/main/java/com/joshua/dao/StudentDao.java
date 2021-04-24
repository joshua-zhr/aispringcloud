package com.joshua.dao;

import com.joshua.entity.Student;

import java.util.Collection;
import java.util.List;

public interface StudentDao {
    Collection<Student> findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);

}

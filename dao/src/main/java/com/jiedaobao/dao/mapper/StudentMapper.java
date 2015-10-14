package com.jiedaobao.dao.mapper;

import com.jiedaobao.dao.domain.Student;

import java.util.List;

/**
 * @author Siva
 *
 */
public interface StudentMapper {

    List<Student> findAllStudents();

    Student findStudentById(Integer id);

    void insertStudent(Student student);

    void updateStudent(Student student);

}

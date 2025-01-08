package com.company.CrudOperation.service;

import com.company.CrudOperation.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student addStudent(String  student);

    List<Student> getAllStudent();

    Optional<Student> getStudentById(int id);

    Student updateStudent(int id, Student  student);

    void deleteStudent( int id);
}

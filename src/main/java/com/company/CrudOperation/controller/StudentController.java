package com.company.CrudOperation.controller;

import com.company.CrudOperation.entity.Student;
import com.company.CrudOperation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
@Autowired
    private StudentService studentService;

@PostMapping
    public Student addStudent(@RequestBody Student student){
     return  studentService.addStudent(student);
}

@GetMapping
    public List<Student>  getAllStudent(){
    return studentService.getAllStudent();
}
}

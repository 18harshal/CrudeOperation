package com.company.CrudOperation.service;

import com.company.CrudOperation.entity.Student;
import com.company.CrudOperation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements  StudentService{
    @Autowired
    private StudentRepository studentRepository;
@Override
    public Student addStudent(Student student)
    {
        return studentRepository.save(student);
    }
@Override
    public List<Student> getAllStudent(){
    return  studentRepository.findAll();
    }
@Override
    public Optional<Student> getStudentById( int id){
    return  studentRepository.findById(id);
    }

    @Override
    public Student updateStudent( int id, Student student){
    Student existingStudent = studentRepository.findById(id).orElse(null);

    if(existingStudent !=null){
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setAge(student.getAge());
        existingStudent.setCity(student.getCity());
        return studentRepository.save(existingStudent);
    }
    throw  new RuntimeException("Student Not Found With Id " +id);
    }

    @Override
    public void deleteStudent( int id){
        return studentRepository.deleteById(id);
    }

}

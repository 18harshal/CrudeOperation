package com.company.CrudOperation.repository;

import com.company.CrudOperation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer> {
}

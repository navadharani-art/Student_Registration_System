package com.example.webapp.repository;

import org.springframework.stereotype.Repository;

import com.example.webapp.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository 
public interface StudentRepository extends  JpaRepository<Student, Long> {
Student findByStudentnameAndDept(String studentname, String dept);
}

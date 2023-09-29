package com.example.thymeleafwebapp.dao;

import  com.example.thymeleafwebapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
}

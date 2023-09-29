package com.example.security2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.security2dbthemeleaf.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
}

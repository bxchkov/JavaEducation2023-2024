package com.sprng.Sprng.service;

import com.sprng.Sprng.dao.StudentDAO;
import com.sprng.Sprng.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getAllStudents(){
        return studentDAO.getAllStudents();
    }

    @Override
    @Transactional
    public Student getStudent(int id){return studentDAO.getStudent(id);}

    @Override
    @Transactional
    public Student saveStudent(Student student){
        return studentDAO.saveStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id){studentDAO.deleteStudent(id);}
}

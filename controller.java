package com.example.demo.controller;

import java.util.List;
import com.example.demo.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;



@RestController
public class StudentController {
    @Autowired
    StudentService studentservice;

    @GetMapping("students")
    
    
    public List<Student> getStudent(){
        return studentservice.getStudent();

    }

    
}

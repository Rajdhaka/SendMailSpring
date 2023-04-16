package com.geekster.SendMailSpring.Controller;

import com.geekster.SendMailSpring.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    Student student;
    @GetMapping("/student")
    public Student getStudent(){
        return student;
    }





}

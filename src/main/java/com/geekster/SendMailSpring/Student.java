package com.geekster.SendMailSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Student {
    String name;
    public Student(String name) {
        this.name = name;
        System.out.println("spring bean  is config");
    }
    public Student(){
        System.out.println("spring bean is config");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

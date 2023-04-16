package com.geekster.SendMailSpring.Controller;

import com.geekster.SendMailSpring.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    User user;
    @GetMapping("/user")
    public User getUser(){
        return user;
    }

}

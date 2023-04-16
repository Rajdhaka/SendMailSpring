package com.geekster.SendMailSpring.Controller;

import com.geekster.SendMailSpring.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationUser {

    @Bean
    public User getUser(){
        System.out.println(" user class Bean is config by spring");
        return new User("Rajesh");
    }

}

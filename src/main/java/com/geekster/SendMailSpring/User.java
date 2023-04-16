package com.geekster.SendMailSpring;

import java.security.PublicKey;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }
    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

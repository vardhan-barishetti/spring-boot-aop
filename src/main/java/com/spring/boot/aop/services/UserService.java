package com.spring.boot.aop.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void createUser(String name){
        System.out.println("Creating USer " + name);
        System.out.println("User Saved");
    }
}

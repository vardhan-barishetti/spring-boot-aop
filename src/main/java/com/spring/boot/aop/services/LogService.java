package com.spring.boot.aop.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    public void mainLogic(String userName, String password){
        System.out.println("userName " + userName);
        System.out.println("password " + password);
        System.out.println("Accessing useful apis");
    }

    public void logout(){
        System.out.println("Login service core logic");
    }
}

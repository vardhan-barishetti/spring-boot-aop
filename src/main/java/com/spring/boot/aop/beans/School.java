package com.spring.boot.aop.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class School {

    public School(){
        System.out.println("School Object Creation");
    }

    public void work(){
        System.out.println("School is open");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception{
        System.out.println("Initilizing School");
        System.out.println("Opening DB connection");
    }

    @PreDestroy
    public void destroy() throws Exception{
        System.out.println("Cleaning up school");
        System.out.println("Closing DB connection");
    }
}

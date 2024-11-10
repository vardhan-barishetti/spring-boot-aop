package com.spring.boot.aop.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//@Component
public class Employee implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Cleaning up employee");
    }

    public Employee(){
        System.out.println("employee created");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Employee");

    }

    public void work(){
        System.out.println("Employee Working");
    }
}

package com.spring.boot.aop.aspects;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogsAspect {

    @Before("execution(* com.spring.boot.aop.services.LogService.login())")
    public void maintainLogs(){
        System.out.println("maintain logs Before");
    }

    @After("execution(* com.spring.boot.aop.services.LogService.logout())")
    public void maintainLogsAfter(){
        System.out.println("maintain logs After");
    }

}

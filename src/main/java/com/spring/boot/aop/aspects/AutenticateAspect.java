package com.spring.boot.aop.aspects;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AutenticateAspect {

    @Around("execution(* com.spring.boot.aop.services.LogService.mainLogic(String, String))")
    public void checkUser(ProceedingJoinPoint point) throws Throwable {
        String username = point.getArgs()[0].toString();
        String password = point.getArgs()[1].toString();

        if(username.equals("admin") && password.equals("admin123")){
            point.proceed();
        }else{
            System.out.println("User is unauthenticated");
            throw new RuntimeException("User is not Authenticated");
        }


    }
}

package com.spring.boot.aop;

import com.spring.boot.aop.beans.Employee;
import com.spring.boot.aop.beans.School;
import com.spring.boot.aop.services.LogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(SpringBootAopApplication.class, args);

//		Employee bean = context.getBean(Employee.class);
//		bean.work();

//		School bean = context.getBean((School.class));
//		bean.work();
		LogService bean = context.getBean(LogService.class);
		bean.mainLogic("admin", "admin123");
		bean.logout();
	}

}

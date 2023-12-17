package com.wzh;

import com.wzh.service.IPersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.wzh.**")
public class SpringSampleApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringSampleApplication.class);

		IPersonService iPersonService = context.getBean(IPersonService.class);
		iPersonService.sayHello();
	}
}
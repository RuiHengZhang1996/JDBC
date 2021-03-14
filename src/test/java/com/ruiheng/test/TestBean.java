package com.ruiheng.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruiheng.spring5.service.UserService;

public class TestBean {
	
	@Test
	public void testAdd() {
		
		//load spring config(bean1.xml)
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean2.xml");
		
		//get created object
		UserService userService = context.getBean("userService", UserService.class);
		
		System.out.println("\n" + userService);
		userService.add();
		
	}
	
}

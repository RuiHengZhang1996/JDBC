package com.ruiheng.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruiheng.spring5.User;

public class TestSpring5 {
	
	@Test
	public void testAdd() {
		
		//load spring config(bean1.xml)
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		
		//get created object
		User user = context.getBean("user", User.class);
		
		System.out.println(user);
		user.add();
		
	}
}

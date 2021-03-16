package com.ruiheng.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruiheng.spring5.aopannotation.User;

public class testTest {

	@Test
	public void test() {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean2.xml");
		
		User user = context.getBean("user", User.class);
		
		user.add();
	}
	
}

package com.ruiheng.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruiheng.spring5.bean.Emp;
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
	
	
	@Test
	public void testBean3() {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean3.xml");
		
		Emp emp = context.getBean("emp", Emp.class);
		System.out.println(emp);
		emp.add();
	}
	
	
	@Test
	public void testBean4() {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean4.xml");
		
		Emp emp = context.getBean("emp", Emp.class);
		System.out.println(emp);
		emp.add();
	}
	
	
	@Test
	public void testBean5() {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean5.xml");
		
		Emp emp = context.getBean("emp", Emp.class);
		System.out.println(emp);
		emp.add();
	}
}

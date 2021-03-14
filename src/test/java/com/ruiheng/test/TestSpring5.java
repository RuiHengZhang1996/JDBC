package com.ruiheng.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruiheng.spring5.Book;
import com.ruiheng.spring5.Orders;
import com.ruiheng.spring5.User;

public class TestSpring5 {
	
	@Test
	public void testAdd() {
		
		//load spring config(bean1.xml)
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		
		//get created object
		User user = context.getBean("user", User.class);
		
		System.out.println("\n" + user);
		user.add();
		
	}
	
	
	@Test
	public void testBook1() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		
		Book book = context.getBean("book", Book.class);
		
		System.out.println("\n" + book);
		book.readBook();
	}
	
	@Test
	public void testOrders() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		
		Orders orders = context.getBean("orders", Orders.class);
		
		System.out.println("\n" + orders);
		orders.orderTest();
	}
}

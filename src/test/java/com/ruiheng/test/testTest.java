package com.ruiheng.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruiheng.spring5.aopannotation.User;
import com.ruiheng.spring5.aopxml.Book;

public class testTest {

	@Test
	public void test() {
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean3.xml");
		
		Book book = context.getBean("book", Book.class);
		
		book.buy();
	}
	
}

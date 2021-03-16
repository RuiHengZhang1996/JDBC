package com.ruiheng.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruiheng.spring5.entity.Book;
import com.ruiheng.spring5.service.BookService;


public class testTest {

	@Test
	public void test() {
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		
		BookService bookService = context.getBean("bookService", BookService.class);
		Book book = new Book();
		book.setUserId("1");
		book.setUsername("2");
		book.setUstatus("3");
		bookService.addUser(book);
	}
	
}

package com.ruiheng.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
		book.setUserId(1);
		book.setUsername("2");
		book.setUstatus("3");
		
		bookService.addBook(book);
	}
	
	
	@Test
	public void test1() {
		String jdbcUrl = "jdbc:mysql:///user_db";
		String username = "root";
		String pass = "admin";
		
		try {
			Connection myconn = DriverManager.getConnection(jdbcUrl, username, pass);
			System.out.println("success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

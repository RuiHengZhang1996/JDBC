package com.ruiheng.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testTest {

	@Test
	public void test() {
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean3.xml");
		
	}
	
}

package com.ruiheng.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruiheng.spring5.collectiontype.Stu;

public class testTest {
	
	@Test
	public void testCollection() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		
		Stu stu = context.getBean("stu", Stu.class);
		
		System.out.println(stu);
		stu.test();
	}
}

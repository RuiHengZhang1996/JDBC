package com.ruiheng.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruiheng.spring5.autowire.Emp;
import com.ruiheng.spring5.bean.Orders;
import com.ruiheng.spring5.collectiontype.Stu;

public class testTest {

	
	/*
	 * @Test public void testCollection() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("bean1.xml");
	 * 
	 * Stu stu = context.getBean("stu", Stu.class);
	 * 
	 * System.out.println(stu); stu.test(); }
	 */
	 

	/*
	 * @Test public void testCollection1() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("bean2.xml");
	 * 
	 * Course course = context.getBean("myBean", Course.class);
	 * 
	 * System.out.println(course);
	 * 
	 * }
	 */

	/*
	 * @Test public void testCollection2() { ClassPathXmlApplicationContext context
	 * = new ClassPathXmlApplicationContext("bean3.xml");
	 * 
	 * Orders orders = context.getBean("orders", Orders.class);
	 * 
	 * System.out.println("fourth: get the bean instance object.");
	 * System.out.println(orders);
	 * 
	 * //write destroy method System.out.println("Fifth: destroy the method");
	 * context.close(); }
	 */

	
	  @Test 
	  public void testTest() { ClassPathXmlApplicationContext context = new
	  ClassPathXmlApplicationContext("bean4.xml");
	  
	  Emp emp = context.getBean("emp", Emp.class); emp.test(); }
	 
}

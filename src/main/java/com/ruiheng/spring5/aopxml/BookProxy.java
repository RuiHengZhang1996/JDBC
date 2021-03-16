package com.ruiheng.spring5.aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


public class BookProxy {
	
	@Before(value = "com.ruiheng.spring5.aopxml.Book")
	public void before() {
		System.out.println("before..  you buying this book .......");
	}
	
}

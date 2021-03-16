package com.ruiheng.spring5.aopannotation;

import org.springframework.stereotype.Component;

@Component
public class User {
	public void add() {
		System.out.println("User adding.........");
	}
}

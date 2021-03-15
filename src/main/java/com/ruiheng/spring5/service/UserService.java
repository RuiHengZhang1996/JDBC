package com.ruiheng.spring5.service;

import org.springframework.stereotype.Component;
// 注解里  value可以不用写，  
//默认值是类名称    首字母小写
@Component(value="userService")   //<bean id="userService" class=""></bean>
public class UserService {
	
	public void add() {
		System.out.println("service adding....");
	}
}

package com.ruiheng.spring5.aopannotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
//你被强化了！
@Aspect
public class UserProxy {
	
	@Before(value = "execution(* com.ruiheng.spring5.aopannotation.User.add(..))")
	public void before() {
		//前置通知
		System.out.println("before...........");
	}
}

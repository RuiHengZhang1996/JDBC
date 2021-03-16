package com.ruiheng.spring5.aopannotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class PersonProxy {
	@Before(value = "execution(* com.ruiheng.spring5.aopannotation.User.add(..))")
	public void qianghua() {
		System.out.println("被强化之前......");
	}
}

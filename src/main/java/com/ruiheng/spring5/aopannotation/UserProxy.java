package com.ruiheng.spring5.aopannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	@After(value = "execution(* com.ruiheng.spring5.aopannotation.User.add(..))")
	public void After() {
		System.out.println("After...........");
	}
	
	@AfterReturning(value = "execution(* com.ruiheng.spring5.aopannotation.User.add(..))")
	public void afterReturning() {
		System.out.println("afterRetruninnggggg..........");
	}
	
	@AfterThrowing(value = "execution(* com.ruiheng.spring5.aopannotation.User.add(..))")
	public void afterThrowing() {
		System.out.println("afterThrowing..................");
	}
	
	@Around(value = "execution(* com.ruiheng.spring5.aopannotation.User.add(..))")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("before around..................");
		
		//被增强的方法执行
		proceedingJoinPoint.proceed();
		System.out.println("after around.....................");
	}
}

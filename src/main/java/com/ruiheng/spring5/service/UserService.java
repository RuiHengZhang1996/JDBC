package com.ruiheng.spring5.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ruiheng.spring5.dao.UserDao;


// 注解里  value可以不用写，  
//默认值是类名称    首字母小写

@Component(value="userService")   //<bean id="userService" class=""></bean>
public class UserService {
	
	
	//定义dao属性
	//不需要set方法
	//添加注入属性注解
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier(value="userDaoImp") private UserDao userDao;
	 */
	//@Resource  //根据类型注入
	@Resource(name="userDaoImp") //根据名称注入
	private UserDao userDao;
	
	@Value(value="abc")
	private String name;
	
	public void add() {
		System.out.println("service adding....");
		System.out.println(name);
		userDao.add();
	}
}

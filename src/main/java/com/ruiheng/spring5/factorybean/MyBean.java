package com.ruiheng.spring5.factorybean;

import org.springframework.beans.factory.FactoryBean;

import com.ruiheng.spring5.collectiontype.Course;

public class MyBean implements FactoryBean<Course>{
	
	//定义返回bean
	@Override
	public Course getObject() throws Exception {
		Course course = new Course();
		course.setCname("aaa");
		return course;
	}

	@Override
	public Class getObjectType() {
		
		return null;
	}
	
}

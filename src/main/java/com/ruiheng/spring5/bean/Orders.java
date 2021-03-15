package com.ruiheng.spring5.bean;

public class Orders {
	private String oname;
	
	
	public Orders() {
		System.out.println("First: executing constructor");
	}


	public void setOname(String oname) {
		this.oname = oname;
		System.out.println("Second, set the attribute using setter method.");
	}
	
	
	//create the init function for execute 
	public void initMethod() {
		System.out.println("Third,create the init function for execute");
	}
	
	
}

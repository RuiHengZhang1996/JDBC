package com.ruiheng.spring5;


//use constructor injections

public class Orders {
	private String oname;
	private String address;
	
	//constructor with parameters(attributes)
	public Orders(String oname, String address) {
		this.oname = oname;
		this.address = address;
	}
	
	public void orderTest() {
		System.out.println(oname + "::" + address);
	}
	
	
}

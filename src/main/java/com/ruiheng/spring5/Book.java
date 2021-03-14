package com.ruiheng.spring5;

// use set to inject dependencies
public class Book {
	
	// create attribute
	private String bname;
	private String bauthor;
	private String address;
	
	public void setBname(String bname) {
		this.bname = bname;
	}


	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}


	public void readBook() {
		System.out.println(bname + " ===>>>  " + bauthor + "===>>" + address);
	}
}

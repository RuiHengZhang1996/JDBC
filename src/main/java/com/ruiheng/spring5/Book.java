package com.ruiheng.spring5;

// use set to inject dependencies
public class Book {
	
	// create attribute
	private String bname;
	private String bauthor;
	
	
	public void setBname(String bname) {
		this.bname = bname;
	}


	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	
	public void readBook() {
		System.out.println(bname + " ===>>>  " + bauthor);
	}
}

package com.ruiheng.spring5.bean;

public class Emp {
	
	private String ename;
	private String gender;
	
	//if the employer belongs to some dept, we shall use object to show it.
	private Dept dept;
	
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void add() {
		System.out.println(ename + "-->" + gender + "-->" + dept);
	}
	public Dept getDept() {
		return dept;
	}
	
	
	
}

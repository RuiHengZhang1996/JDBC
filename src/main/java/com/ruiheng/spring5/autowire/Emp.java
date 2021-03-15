package com.ruiheng.spring5.autowire;

public class Emp {
	
	private String ename;
	
	private Dept dept;

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [dept=" + dept + "]";
	}

	public void test() {
		System.out.println(dept);
	}
}

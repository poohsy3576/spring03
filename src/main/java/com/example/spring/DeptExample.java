package com.example.spring;

public class DeptExample {

	public static void main(String[] args) {
		
		Dept dept = new Dept();
		dept.setDeptno(10);
		dept.setDname("개발부");
		dept.setLoc("seoul");
		
		System.out.println(dept.getDeptno() + ", " + dept.getDname() + ", " + dept.getLoc());
		
	}

}

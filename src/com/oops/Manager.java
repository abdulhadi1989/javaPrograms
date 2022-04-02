package com.oops;

public class Manager extends Employee{
	
	//Fields(Instance variables)
//	private int empId;
//	private String name;
//	private String ssn;
//	private double salary;
//	private String deptName;
	
	private String deptName;
	
	public Manager(int empId,String name,String ssn,double salary,String deptName) {
		super(empId, name, ssn, salary);
		this.deptName = deptName;
	}

}

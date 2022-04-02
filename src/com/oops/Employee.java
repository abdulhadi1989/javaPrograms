package com.oops;

public class Employee {
	
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	//constructor
	public Employee(int empId,String name,String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public void changeName(String newName) {
		if(newName!=null) {
			this.name=newName;
		}
	}

	public void raiseSalary(double increase) {
		this.salary+=increase;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getssn() {
		return ssn;
	}
	public double getSalary() {
		return salary;
	}
}

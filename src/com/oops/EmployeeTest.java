package com.oops;


//Example program for encapsulation

public class EmployeeTest {

	public static void main(String[] args) {
		//Employee emp1 = new Employee(); // will throw error as there is no default constructor
		
		Employee emp1 = new Employee(12,"Jim","as11",-41212);
		emp1.raiseSalary(300);
		int employee_id = emp1.getEmpId();
		String employee_name = emp1.getName();
		double salary = emp1.getSalary();
		String ssn = emp1.getssn();
		System.out.println("Details of Employee: ");
		System.out.println("Name="+employee_name+"ssn="+ssn);
		
		

	}

}

package com.learn;

public class EMployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setEmpId(10001);
		emp.setName("Abdullah");
		emp.setSsn("003-1112-5231");
		emp.setSalary(1200000);
		
		System.out.println("Emp ID: "+emp.getEmpId());
		System.out.println("Emp Name: "+emp.getName());
		System.out.println("Emp SSN: "+emp.getSsn());
		System.out.println("Emp Salary: "+emp.getSalary());
		

		
	}

}

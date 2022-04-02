package com.oops.client;

import com.oops.Manager;

public class Program {

	public static void main(String[] args) {
		Manager mgr = new Manager(103,"Vinod","12-123-123-22",30000,"Sales");
		System.out.println("Name: "+mgr.getName());
		System.out.println("SSN: "+mgr.getssn());
		System.out.println("Before Increase of Manager Salary: "+mgr.getSalary());
		mgr.raiseSalary(1000000);
		System.out.println("After Increase of Manager Salary: "+mgr.getSalary());
		

	}

}

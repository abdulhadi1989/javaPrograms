package com.basic.programs;

import java.util.Scanner;

public class factorial {

	public static void main(String args[]) {
		
		System.out.println("Test print");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("The factorial of "+num+" is "+fact);
		
		
	}
}

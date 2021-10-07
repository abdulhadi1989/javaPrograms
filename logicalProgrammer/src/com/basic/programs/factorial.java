package com.basic.programs;

import java.util.Scanner;

public class factorial {

	public static void main(String args[]) {
		
		//Get the number from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
	   //Print the number and also the factorial result in console output
		System.out.println("The factorial of "+num+" is "+fact);
		
		
	}
}

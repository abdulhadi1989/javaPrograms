package com.learn;

public class ArrayOperations {

	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = "Ram";
		names[1] = "Sam";
		names[2] = "Mam";
				
		for(String name : names) {
			System.out.println("Name: "+name);
		}

	}

}

package com.learn;

public class StringOperations {

	public static void main(String[] args) {
		String s = "Hello";
		s.concat(" world");
		System.out.println(s); //only Hello is printed
		
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("String sb :" +sb);
		sb.append(" World");
		System.out.println("String sb :" +sb);
		
		//Chaining
		sb.append("!").append("are").append(" You?");
		System.out.println("String sb: " +sb);
		
		sb.insert(12, "How");
		System.out.println("String sb: " +sb);
		
		//Get length
		System.out.println("Length: "+sb.length());
		
		//Get SubString
		System.out.println("Sub String : " +sb.substring(0,5));

	}

}

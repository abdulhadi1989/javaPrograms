package com.learn;

public class SwitchCaseEg {

	
	/*Please note this program contains run time arguements
	To run this program follow the steps
	1. Go to the folder in Terminal/Command line
	2. javac SwitchCaseEg.java
	3. java SwitchCaseEg

*
*/
		public static void main(String[] args) {
//			char grade = 'B'; // key
			char grade = args[0].charAt(2);
			switch (grade) {
			case 'A':
				System.out.println("Excellent!");
				break;
			case 'B':
			case 'C':
				System.out.println("Well done");
				break;
			case 'D':
				System.out.println("You Passed");
			case 'F':
				System.out.println("Better try again");
				break;
			default:
				System.out.println("Invalid grade");
				break;
			}
			System.out.println("Your grade is " + grade);
		}
	
}

package com.learn;
import javax.swing.JOptionPane;

public class SwitchStringStatement {
	
	public static void main(String[] args) {
		//String color = "Blue";
		String shirt = "Shirt";
		
		String color = JOptionPane.showInputDialog("Enter color:");
		switch (color)
		{
		case "Blue":
			shirt ="Blue "+shirt;
			break;
		
		case "Red":
			shirt ="Red "+shirt;
			break;
		default:
			shirt="White "+shirt;
		}
		System.out.println("Shirt type: "+shirt);
	}

}

package core.java;

import java.util.Scanner;

public class Ex_23_Switch {
	
	public static void main(String[] args) {
		
		
		System.out.println("enter 1 or 2");
	Scanner scan = new Scanner(System.in);
	String input =scan.nextLine();
	
	int intinput= Integer.parseInt(input);
	
	
	
	switch (intinput) {
	case 1:
		 System.out.println("Key pressed is First number");
		break;
	case 2:
		
		System.out.println("Key pressed is second number");
		break;
	default:
		 System.out.println("press 1 and 2");
		break;
	}
	

	
	}
	}
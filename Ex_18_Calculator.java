package core.java;

import java.util.Scanner;

public class Ex_18_Calculator {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a first number  Value");
		String input1 =scan.nextLine();
		
		double  d1 =Double.parseDouble(input1);
		
		System.out.println("Enter a second number");
		String input2= scan.nextLine();
		
		double d2= Double.parseDouble(input2);
		
		double d3= d1+d2;
		
		System.out.println("the output"+d3);
		
		
		
	}
	
	
}

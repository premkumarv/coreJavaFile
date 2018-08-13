package core.java;

import java.util.Scanner;

public class Ex_13String_MultipleValues {

	
public static void main(String[] args) {
	
	String str1 ="Hello";
	String str2="World";
	String str3 = str1+","+str2+"!";
	System.out.println(str3);

	StringBuilder sb = new StringBuilder("Hello");
	
	 sb.append(",");
	 sb.append("World");
	 sb.append("!");
	 sb.append("prem kumar");
	 
	System.out.println(sb);
	  
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Value");
	String input = scan.nextLine();
	
	
	// delete conntains in sb
	sb.delete(0, sb.length());
	
	
	for (int i =0; i<5;i++){
		
		input= scan.nextLine();
		sb.append(input+"\n");
		
		
	}
	
	System.out.println(sb);
	
	
	
	
	
	
}
}

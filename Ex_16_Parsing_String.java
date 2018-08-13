package core.java;

public class Ex_16_Parsing_String {
	
	
	public static void main(String[] args) {
	
		String s1 ="Welcome to california      ";
		
		System.out.println("Length of the String "+s1.length());
		
		int position =s1.indexOf("california");
		
		System.out.println("Position of Substring "+position);
		
		String s2 = s1.substring(0, 11);
		System.out.println("substring ="+s2);
		
		int len = s1.length();
		System.out.println("length of substring s2 is :"+len);
		
		String s3 = s1.trim();
		System.out.println(s3.length());
		
		
		 
		
	}
}

package core.java;

import java.text.NumberFormat;

public class Ex_12_PrimitiveVal2_String {
	
	public static void main(String[] args) {
		
		int intValue =42;
		String fromIntString= Integer.toString(intValue);
		System.out.println(fromIntString);
		
		
		boolean booValue = true;
		String booStr = Boolean.toString(booValue);
		System.out.println(booStr);
		
		long longValue =10_000_000;
		NumberFormat formatter = NumberFormat.getNumberInstance();
		
		String formatted = formatter.format(longValue);
		System.out.println(formatted);

     		
		
		
	}
	
	
	
	
	
	

}

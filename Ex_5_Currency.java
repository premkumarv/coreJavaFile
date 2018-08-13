package core.java;

import java.math.BigDecimal;

public class Ex_5_Currency {

	
	public static void main(String[] args) {
	
		double value =.012d;
		
		double pSum = value+value+value;
		System.out.println("Sum of Primitives :"+pSum);
		
		String strValue =Double.toString(value);
		System.out.println("strValue:"+strValue);
		
		BigDecimal bigValue =new BigDecimal(strValue);
		
		BigDecimal bsum= bigValue.add(bigValue).add(bigValue);
		System.out.println("Sum of Big Decimal:"+bsum.toString());
		
		
		
		
		
		
	}
	
}

/*
 * casting value interger, float , double ...
 */


package core.java;

public class Ex_6_NumericValue {
	
	public static void main(String[] args) {
	
		int intValue1 =56;
		int intValue2 =intValue1;
		
		System.out.println("the 2nd value is " +intValue2);
		
		long longValue = intValue2;
		
		System.out.println("The long value is "+longValue);
		
		Short shortValue = (short) intValue2;
		System.out.println(" the Short value is "+shortValue);
		
		byte byteValue = (byte)intValue1;
		System.out.println("The byte value is "+byteValue);
		
		double  doubleValue = 0.002D;
		float floatValue = (float)doubleValue;
		System.out.println("Float Value is "+ floatValue);
		
		int intValue3= 1113;
		
		float floatValue2=12212121.00F;
		int intValue4= (int) floatValue2;
		
		System.out.println("The float Value 2 is "+intValue4);
		
		
		
		float floatValue1= intValue3;
		
		System.out.println("the float value is "+floatValue1);
	}

}

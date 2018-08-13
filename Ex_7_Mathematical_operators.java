package core.java;

public class Ex_7_Mathematical_operators {
	
	
	public static void main(String[] args) {
		
	int intValue1 = 56;
	int intValue2 = 42;
	
	int result = intValue1+ intValue2;
	System.out.println("Addition : "+ result);
	
	int result2 =intValue1-intValue2;
	System.out.println("Subtraction:"+result2);
	
	int result3 =intValue1*intValue2;
	System.out.println("Multiplication:"+result3);
	
	double result4 =(double)intValue1/intValue2;
	System.out.println("Division:"+result4);
	
	double result5 =(double)intValue1%intValue2;
	System.out.println("Subtraction:"+result5);
	
	double doubleValue = -3.9999999;
	System.out.println("rounded : "+ Math.round(doubleValue));
	
	System.out.println("rounded : "+ Math.abs(doubleValue));
	
	}
	

}

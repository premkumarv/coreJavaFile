package core.java;

public class Ex_8_BooleanValue {

	static boolean bdef;
	
	public static void main(String[] args) {
	
		boolean b1= true;
		boolean b2 = false;
		System.out.println("The Value of b1 is "+b1);
		System.out.println("The Value of b2 is "+b2);
		System.out.println("The Value of bdef is "+bdef);
		
		boolean b3=!b1;
		
		System.out.println("The Value of b3 is"+b3);
		
		int i1=0;
		boolean b4= ( i1!=0);
		System.out.println("The value of b4 is"+b4);
		
		String sboolean ="True";
		
		boolean parsed  = Boolean.parseBoolean(sboolean);
		System.out.println("Parsed:"+parsed);
		
		
	}
	
}

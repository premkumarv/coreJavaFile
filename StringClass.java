package core.java;

public class StringClass {
	
	public static void main(String[] args) {
		
	
	String s1 =" This is also a String!";
	
	System.out.println(s1);
	
	String  s2 = new String("this is also new string");
	
	System.out.println(s2);
	
	String s3= "shirt size";
	String s4=" M";
	String s5= s3+s4+",Qty is "+4;
	System.out.println(s5);
	char[] chars={'H','E','L','L','O'};
	String s6 = new String(chars);
	
	System.out.println(s6);
	
	}

}

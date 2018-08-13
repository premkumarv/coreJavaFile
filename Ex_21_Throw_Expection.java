package core.java;

public class Ex_21_Throw_Expection {
	
	public static void main(String[] args) throws Exception {
		
	
	String welcome ="Welcome!";
	
	char [] chars = welcome.toCharArray();
	
	if(chars.length < 10)
	{
		throw (new Exception("My Custom message"));
		
	}
	
	
	
	}
}

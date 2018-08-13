package core.java;

public class Ex_14_Compar_String {

	
	public static void main(String[] args) {
	
		String str1 ="Hello";
		String str2="Hello";
		
		if (str1==str2){
			System.out.println("they Match");
		}else{
			System.out.println("they dont match ");
		}
		String str3 ="hello";
		if (str1==str3){
			System.out.println("They match");
			
		}else{
			System.out.println("they dont match");
			
		}
	
	
	String pa1 = "Hello";
	String pa2 ="World";
	String str5 = pa1+pa2;
	String str6 = "Hello World";
			
			if (str5 == str6){
				System.out.println("they match");
			}
			else
			{
				System.out.println("They dont match");
			}
			
   if (str6.equalsIgnoreCase(str5)){
	   
	   System.out.println("They match");
			
		}else //if(str5.equalsIgnoreCase(str6))
			
			System.out.println("they dont match");
   
	}
	
}
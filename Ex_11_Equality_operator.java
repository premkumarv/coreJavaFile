package core.java;

public class Ex_11_Equality_operator {
public static void main(String[] args) {
	// compare two strings

	String s = "Hello";
	String s1="hello";
	
	if (s==s1){
		System.out.println("They match other other" );
	}else if(s!=s1)
	{
	System.out.println("they dont match other");
	
   }
	
	if(s instanceof java.lang.String){
		System.out.println("s is a string");
		
	}
	
	if(s.equals(s1)){
		System.out.println("they match");
		
	}else {
		System.out.println("they dont mat");
	}
	
	
	
	String ad = s==s1? "theymatch":"dontmatch";
	
	System.out.println(ad);
	
}
}

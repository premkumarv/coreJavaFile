package core.java;

public class Ex_19_Try_Catch {

	
	public static void main(String[] args) {
	
		
		String welcome = "Welcome!";
		
		char []chars =welcome.toCharArray();
		
		//System.out.println(chars.length);
		try{
		char lastChar = chars[chars.length];
		
		System.out.println(lastChar);
		}catch (ArrayIndexOutOfBoundsException e){
			
			e.printStackTrace();
		}
	}
	
}

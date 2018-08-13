package core.java;

public class Ex_20_Multiple_Catch {
	
	
	public static void main(String[] args) {
	
		String welcome ="Welcome!";
		
		char []chars =welcome.toCharArray();
		try{
		char lastchar =chars[chars.length];
		System.out.println(lastchar);
		
		String st =welcome.substring(13);
		System.out.println(st);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("array index problem!");
		}catch(StringIndexOutOfBoundsException es){
			
			es.printStackTrace();
			System.out.println("Sting outof bound problem");
		}
	
			
			
		
		
		
	}

}

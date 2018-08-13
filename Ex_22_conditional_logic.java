package core.java;

public class Ex_22_conditional_logic {
	
	public static void main(String[] args) {
	
		
		int monthNumber =9;
		
		if (monthNumber >=1 && monthNumber<=4){
			System.out.println("first Q");
		}else if(monthNumber >=5 && monthNumber <=8 ){
			
			System.out.println("Second Q");
		} else if (monthNumber>=9 && monthNumber <12){
			System.out.println("Third Q");
		}else
		{
			
			System.out.println("enter no between 1 to 12");
		}
	}
	

}

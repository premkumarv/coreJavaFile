package core.java;

public class Ex_24_Loop_Code {
public static void main(String[] args) {
	

	
	String []months ={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
	//System.out.println("Months Regular order ");
	//for (int i=0; i<=12;i++){
		
		//System.out.println(months[i]);
	//}
	
	//System.out.println("Months Regular Reverse order ");
	//for (int i=11; i>=0;i--){
		
		//System.out.println(months[i]);
	//}
	
	
  // for (int i=0; i<=months.length-1;i++){
		
  //		System.out.println(months[i]);
  //	}
	
	
	for (String month:months){
		
		System.out.println(month);
	}
	
	
}
}
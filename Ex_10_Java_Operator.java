package core.java.rough;

public class Ex_10_Java_Operator {
	
	
	public static void main(String[] args) {
	
		
		int intValue =10;
		
		int newValue = intValue+5;
		System.out.println("first new value "+newValue);
		
		int newValue1 =intValue-5;
		System.out.println("Second new value "+newValue1);
		
		int newValue2 =intValue*5;
		System.out.println("third new value "+newValue2);
		
		int newValue3 =intValue/5;
		System.out.println("fourth new value "+newValue3);
		
		int newValue4 = intValue%5;
		System.out.println("Fifth new value "+newValue4);
		
		int invalue = 0;
		invalue ++;
		System.out.println("incremented value "+invalue);
		
		invalue --;
		System.out.println("decremented value"+invalue);
		
		
		invalue +=5;
		System.out.println("incremented by 5 value  "+invalue);
		
		invalue -=10;
		System.out.println("decremented by 10 value"+invalue);
		
		invalue *=5;
		System.out.println("Multiple by 5  value"+invalue);
		
		invalue /=5;
		 
		System.out.println("Divide by 5 value "+invalue);
		
		
		// postfix
		
		int postValue =10;
		System.out.println(postValue ++);
		System.out.println(postValue);
		
		
		//prefix value
		
		int preValue=10;
		System.out.println(++ preValue );
		System.out.println(preValue);
		
	}
	

}

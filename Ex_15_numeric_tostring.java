package core.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex_15_numeric_tostring {

	
	
	public static void main(String[] args) {
	
	Locale local= new Locale("da","DK");
		
		double doubleValue =1_234_567.89;
		
		NumberFormat numf = NumberFormat.getNumberInstance(local);
		
		System.out.println("Number:"+numf.format(doubleValue));
		
		NumberFormat curf = NumberFormat.getCurrencyInstance(local);
		
		System.out.println("currency:"+curf.format(doubleValue));
		
		NumberFormat intf =NumberFormat.getIntegerInstance(local);
		
		System.out.println("Integer"+intf.format(doubleValue));
		
		
	}
}

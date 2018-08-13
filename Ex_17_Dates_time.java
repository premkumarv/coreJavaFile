package core.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex_17_Dates_time {
	
	
	public static void main(String[] args) {
	
		LocalDateTime ldt= LocalDateTime.now();
		
		System.out.println("Local Time and Date "+ldt);
		
		
		LocalDate ld=LocalDate.of(2009, 02, 12);
		
		System.out.println("Defined year is" +ld);
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("M/d/YY");
		System.out.println(dtf.format(ldt));
	}

}

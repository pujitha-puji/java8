package com.dateAndTimeApi;

import java.time.LocalDate;

public class DateDemo2 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		int day = currentDate.getDayOfMonth();
		int month = currentDate.getMonthValue();
		int year = currentDate.getYear();
		System.out.println(day+"/"+month+"/"+year);
		
		System.out.printf("%d:%d:%d", day,month,year);
		
	}

}

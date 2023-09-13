package com.dateAndTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTimeDemo1 {
	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current);
		
		LocalDateTime current2 = current.of(2023, 8, 26, 12, 11);
		System.out.println(current2);
		
		LocalDate customizedDate = LocalDate.of(2023, 8, 26);
		System.out.println(customizedDate);
		
		LocalDate expireyDate = customizedDate.plusMonths(4);
		System.out.println(expireyDate);
		
		LocalDate validity = customizedDate.plusYears(1);
		System.out.println(validity);
		
		
	}

}

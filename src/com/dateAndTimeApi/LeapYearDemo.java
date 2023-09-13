package com.dateAndTimeApi;

import java.time.LocalDate;

public class LeapYearDemo {
	public static void main(String[] args) {
		boolean leapYear = LocalDate.parse("2022-08-22").isLeapYear();
		System.out.println("the given leap is : "+leapYear);
		
		boolean before = LocalDate.parse("2025-08-22").isBefore(LocalDate.parse("2023-05-11"));
		System.out.println(before);
	}

}

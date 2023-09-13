package com.dateAndTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class PeroidDemo {
	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(1997, 10, 27);
		LocalDate current = LocalDate.now();
		
		Period age = Period.between(dob, current);
		System.out.printf("Age is %d Years %d Months %d Days",age.getYears(),age.getMonths(),age.getDays());
		
		
	}

}

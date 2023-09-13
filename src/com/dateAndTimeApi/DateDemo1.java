package com.dateAndTimeApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		//Converting date obj format to String format -> format()
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		String formatString = sdf.format(d);
		System.out.println(formatString);
		
		//Converting string to date
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = sdf1.parse("2023-08-26");
		System.out.println(parsedDate);
	}

}

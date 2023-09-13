package com.dateAndTimeApi;

import java.time.LocalTime;

public class TimeDate {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		int hour = currentTime.getHour();
		int minute = currentTime.getMinute();
		int second = currentTime.getSecond();
		int nano = currentTime.getNano();
		System.out.println(hour+":"+minute+":"+second+":"+nano);
	}

}

package com.dateAndTimeApi;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo {
	public static void main(String[] args) {
		Duration between = Duration.between(LocalTime.parse("06:00"), LocalTime.now());
		System.out.printf("%d:%d:%d",between.toHours(),between.toMinutes(),between.getSeconds());
	}

}

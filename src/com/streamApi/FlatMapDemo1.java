package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo1 {
	public static void main(String[] args) {
		List<String> javacourse = Arrays.asList("core java", "adv java", "springboot");
		List<String> uicourse = Arrays.asList("html", "bs", "css", "js");
		List<List<String>> course = Arrays.asList(javacourse,uicourse);
		
		course.stream().flatMap(s ->s.stream()).forEach(System.out::println);
	}

}

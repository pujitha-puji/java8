package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class SlicingDemo1 {
	public static void main(String[] args) {
		List<String> letters = Arrays.asList("a","a","b","c","d","e","f");
		System.out.println("distinct method");
		letters.stream().distinct().forEach(System.out::println);
		System.out.println("limit method");
		letters.stream().limit(2).forEach(System.out::println);
		System.out.println("skip method");
		letters.stream().skip(3).forEach(System.out::println);
		
	}

}

package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo3 {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		List<String> alph = Arrays.asList("a","b","c","d","e");
		List<List<? extends Object>> content = Arrays.asList(num,alph);
		
		content.stream().flatMap(c->c.stream()).forEach(System.out::println);
	}

}

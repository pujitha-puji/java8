package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo2 {
	public static void main(String[] args) {
		List<String> boys = Arrays.asList("steve","dustin","jim","bucky");
		List<String> girls = Arrays.asList("eleven","maxine","karen","joyce");
		List<List<String>> friends = Arrays.asList(boys,girls);
		
		friends.stream().flatMap(s->s.stream()).forEach(System.out::println);
	}

}

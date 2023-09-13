package com.streamApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo1 {
	public static void main(String[] args) {
		Stream<Integer> str = Stream.of(1,2,3,4,5,6,7,8,9);
		str.forEach(System.out::println);
		
		ArrayList<String> names = new ArrayList<>();
		names.add("mohan");
		names.add("sanjay");
		names.add("naveen");
		names.add("teja");
		names.add("pujitha");
		
		Stream<String> NamesStream = names.stream();
		NamesStream.forEach(System.out::println);
	}

}

package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
	public static void main(String[] args) {
		List<String> employee = Arrays.asList("Mohan", "Raju", "Sanjay", "Naveen");
		employee.stream().mapToInt(e ->e.length()).forEach(System.out::println);
	}

}

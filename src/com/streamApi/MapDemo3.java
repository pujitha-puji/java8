package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapDemo3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mohan","Mythili","Sai","Raju","Mohith","Max");
		names.stream().filter(n ->n.startsWith("M")).map(l ->l.length()).forEach(System.out::println);
		
	}

}

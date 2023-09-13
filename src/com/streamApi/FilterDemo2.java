package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mohan", "Mahesh","Mohan", "Mythili","Sanjay", "Naveen");
		//names.stream().filter(i->i.startsWith("M")).forEach(i->System.out.println(i));
		//names.stream().filter(i->i.endsWith("n")).forEach(i->System.out.println(i));
		//names.stream().filter(i->i.contains("n")).forEach(i->System.out.println(i));
		names.stream().filter(i->i.contentEquals("Mohan")).forEach(i->System.out.println(i));
	}

}

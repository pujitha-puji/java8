package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesRemoveDemo {
	public static void main(String[] args) {
		String a="abcaaaabbbbccc";
		String[] b = a.split("");
		
		//Approach 1 using distinct method ad collecting them
		List<String> list = Arrays.asList(b);
		list.stream().distinct().collect(Collectors.toList()).forEach(i->System.out.println(i));
		
		
		//Approach 2 using collecting them into set because set don't allow duplicates
		String[] c = a.split("");
		List<String> list2 = Arrays.asList(c);
		list2.stream().collect(Collectors.toSet()).forEach(i->System.out.println(i));
		
	}
}
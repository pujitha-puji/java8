package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MatchingDemo1 {
	public static void main(String[] args) {
		Person p1 = new Person("Steve","America");
		Person p2 = new Person("Mohan","India");
		Person p3 = new Person("Rahim","Bangladesh");
		Person p4 = new Person("Gal","Europe");
		
		List<Person> p = Arrays.asList(p1,p2,p3,p4);
		boolean anyIndian = p.stream().anyMatch(e ->e.country.equals("India"));
		System.out.println("anyMatch");
		System.out.println("Any Indian : "+anyIndian);
		boolean anyIndians = p.stream().allMatch(e ->e.country.equals("India"));
		System.out.println("allMatch");
		System.out.println("All persons are Indians : "+anyIndians);
		boolean noneIndia = p.stream().noneMatch(e ->e.country.equals("China"));
		System.out.println("noneMatch");
		System.out.println("is there country china : "+noneIndia);
	}

}

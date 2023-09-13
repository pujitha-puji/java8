package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(67,47,3,33,54,64,838,7,21);
		
		// normal method
		/*
		 * for(Integer i:list) { if(i>20) { System.out.println(i); } }
		 */
		
		/*
		 * Stream<Integer> stream = list.stream(); Stream<Integer> filter =
		 * stream.filter(i -> i>20); filter.forEach(i->System.out.println(i));
		 * 
		 */
		// filter stream
		//list.stream().filter(i->i>20).forEach(i->System.out.println(i));
		list.stream().filter(j->j<32).forEach(j->System.out.println(j));
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		
	}

}

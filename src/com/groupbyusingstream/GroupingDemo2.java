package com.groupbyusingstream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingDemo2 {
	public static void main(String[] args) {
		int arr[] = {};
		
		List<Integer> num = Arrays.asList(1,0,1,0,0,1,0,3,2,2,3,4,0,0);
		Map<Integer, Long> numbers = num.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(numbers);
	}

}

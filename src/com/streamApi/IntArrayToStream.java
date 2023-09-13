package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;

public class IntArrayToStream {
	public static void main(String[] args) {
		int arr[] = {1,-5,3,14,-2,17};
		
		int secondLargestNumber = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
		System.out.println("the second largest number is : "+secondLargestNumber);
		
		int secondLowestNumber = Arrays.stream(arr).boxed().sorted().limit(2).skip(1).findFirst().get();
		System.out.println("the second lowest number is : "+secondLowestNumber);
		
		int sum = (secondLargestNumber+secondLowestNumber);
		System.out.println(sum);
	}

}

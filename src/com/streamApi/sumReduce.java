package com.streamApi;

import java.util.Arrays;

public class sumReduce {
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5};
		
		int sum = 0;
		for (int i : nums) {
			sum = sum+i;
		}
		System.out.println(sum);
		System.out.println("=====normal java 1.7=========");
		
		int reduceValue = Arrays.stream(nums).reduce(0, (a,b)->a+b);
		System.out.println("The reduce value is : "+reduceValue);
	}

}

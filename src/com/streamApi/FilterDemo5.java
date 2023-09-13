package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo5 {
	public static void main(String[] args) {
		List<Integer> nmbr = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		nmbr.stream().filter(i -> i%2==0).forEach(i ->System.out.println(i));
		
	}

}

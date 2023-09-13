package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo4 {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(34,45,57,69,64,59,93,498,387,387);
		asList.stream().filter(i -> i<=200).forEach(i -> System.out.println(i));
	}

}

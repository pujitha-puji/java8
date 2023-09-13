package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo7 {
	public static void main(String[] args) {
		List<String> onlineServises = Arrays.asList("rapido","swiggy","zamoto","uber");
		onlineServises.stream().filter(os ->os.contains("r")).forEach(System.out::println);
	}

}

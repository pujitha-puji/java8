package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {

	public static void main(String[] args) {
		List<String> countryNames = Arrays.asList("India", "Pakistan","Ukarain","America","London","Korea");
		countryNames.stream().map(names -> names.toUpperCase()).forEach(System.out::println);
		countryNames.stream().map(n ->n.toLowerCase()).forEach(System.out::println);
		countryNames.stream().map(l ->l.length()).forEach(System.out::println);
		countryNames.stream().map(a ->a.substring(1)).forEach(System.out::println);
		countryNames.stream().map(b ->b.concat("n")).forEach(System.out::println);;

	}

}

package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo6 {
	public static void main(String[] args) {
		MobileStock m1 = new MobileStock("redmi",1002, 16000);
		MobileStock m2 = new MobileStock("samsung",2922, 10000);
		MobileStock m3 = new MobileStock("nokia",3287, 7000);
		MobileStock m4 = new MobileStock("vivo",43998, 12000);
		MobileStock m5 = new MobileStock("oppo",5383, 17000);
		MobileStock m6 = new MobileStock("realmi",6332, 22000);
		
		List<MobileStock> mobiles = Arrays.asList(m1,m2,m3,m4,m5,m6);
		mobiles.stream().filter(m ->m.price>10000).forEach(System.out::println);
		
	}
}

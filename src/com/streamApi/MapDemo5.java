package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapDemo5 {
	public static void main(String[] args) {
		MobileStock m1 = new MobileStock("redmi",1, 16000);
		MobileStock m2 = new MobileStock("samsung",2, 10000);
		MobileStock m3 = new MobileStock("nokia",3, 7000);
		MobileStock m4 = new MobileStock("vivo",4, 12000);
		MobileStock m5 = new MobileStock("oppo",5, 17000);
		MobileStock m6 = new MobileStock("realmi",6, 22000);
		
		List<MobileStock> mobiles = Arrays.asList(m1,m2,m3,m4,m5,m6);
		mobiles.stream().filter(m->m.price>12000).filter(m->m.mobileName.startsWith("o")).map(m->m.mobileName).forEach(System.out::println);
	}

}

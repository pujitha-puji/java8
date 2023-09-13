package com.collectorspractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo1 {
	public static void main(String[] args) {
		Person p1 = new Person("steve","america");
		Person p2 = new Person("roger","german");
		Person p3 = new Person("mia","india");
		Person p4 = new Person("cassey","cannada");
		Person p5 = new Person("kumar","india");
		
		List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);
		List<String> indians = personList.stream().filter(p->p.country.equalsIgnoreCase("India")).map(s->s.name).collect(Collectors.toList());
		System.out.println(indians);
	}

}

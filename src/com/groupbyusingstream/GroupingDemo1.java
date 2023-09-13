package com.groupbyusingstream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingDemo1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(111,"Steve",20000.0,"America");
		Employee e2 = new Employee(112,"Lyla",20000.0,"Canada");
		Employee e3 = new Employee(113,"Eric",20000.0,"Africa");
		Employee e4 = new Employee(114,"Maya",20000.0,"Italy");
		Employee e5 = new Employee(115,"Kristen",20000.0,"Britan");
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
		Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(e->e.name));
		
		System.out.println(map);
	}

}

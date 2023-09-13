package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapDemo4 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Mohan", 23, 55000.0);
		Employee e2 = new Employee("Sanjay", 17, 25000.0);
		Employee e3 = new Employee("Naveen", 65, 75000.0);
		Employee e4 = new Employee("Ravi", 30, 35500.0);
		Employee e5 = new Employee("Harish", 44, 63000.0);
		
		List<Employee> emps = Arrays.asList(e1,e2,e3,e4,e5);
		emps.stream().filter(e -> e.salary>36000.0).map(e ->e.age).forEach(System.out::println);
		emps.stream().filter(e -> e.age>28).map(e -> e.name).forEach(System.out::println);
	}

}

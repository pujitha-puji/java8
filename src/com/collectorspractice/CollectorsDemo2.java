package com.collectorspractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsDemo2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(111,"Mohan",20000.00);
		Employee e2 = new Employee(112,"Sanjay",25000.00);
		Employee e3 = new Employee(113,"Naveen",30000.00);
		Employee e4 = new Employee(114,"Teja",22000.00);
		Employee e5 = new Employee(115,"Pujitha",15000.00);
		Employee e6 = new Employee(116,"Ram",35000.00);
		
		List<Employee> employeesList = Arrays.asList(e1,e2,e3,e4,e5,e6);
		Optional<Employee> optional = employeesList.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		
		if(optional.isPresent()) {
			System.out.println(optional);
		}
		Optional<Employee> optional2 = employeesList.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
		
		if(optional2.isPresent()) {
			System.out.println(optional2);
		}
		Double averageSalary = employeesList.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println(averageSalary);
	}

}

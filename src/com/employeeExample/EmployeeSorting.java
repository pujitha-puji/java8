package com.employeeExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeSorting {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1,"steve",25,"male","hr",2005,25000.0));
		employeeList.add(new Employee(2,"jeeva",23,"male","marketing",2002,33000.0));
		employeeList.add(new Employee(3,"drax",30,"male","hr",2015,52000.0));
		employeeList.add(new Employee(4,"paru",31,"female","admin",2018,38000.0));
		employeeList.add(new Employee(5,"gaya",55,"female","security",2025,15000.0));
		employeeList.add(new Employee(6,"nathan",35,"male","finance",2019,27000.0));
		employeeList.add(new Employee(7,"stella",40,"female","marketing",2020,32000.0));
		employeeList.add(new Employee(8,"alex",25,"male","sales",2009,55000.0));
		employeeList.add(new Employee(9,"taylor",44,"male","admin",2019,50000.0));
		employeeList.add(new Employee(10,"dustin",37,"male","infrastructure",2022,26500.0));
		employeeList.add(new Employee(11,"maxine",33,"female","development",2013,37000.0));
		
		//1. How many employees males and females are there in the organization?
		Map<String, Long> maleFemale = employeeList.stream().collect(Collectors.groupingBy((Employee::getGender), Collectors.counting()));
		System.out.println(maleFemale);
		System.out.println("===================================");
		//2. Write a java code to print all department?
		List<String> department = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println(department);
		System.out.println("===================================");
		//3. Write a java code to print average age of male and female in the organization?
		Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy((Employee::getGender),Collectors.averagingDouble(Employee::getAge)));
		System.out.println(avgAge);
		System.out.println("===================================");
		//4. Write a java code to print highest paid employee in the organization?
		Optional<Employee> highestPaid = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(highestPaid.get().name);
		System.out.println("===================================");
		//5. Write a java code to get employee joined after 2015?
		employeeList.stream().filter(e->e.yearOfJoining>2015).map(e->e.name).forEach(System.out::println);
		System.out.println("===================================");
		//6. Count the number of employees in each department?
		Map<String, Long> depart = employeeList.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.counting()));
		System.out.println(depart);
		System.out.println("===================================");
		//7. What is the age salary of each department?
		Map<String, Double> ageSalary = employeeList.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(ageSalary);
		System.out.println("===================================");
		//8. get the youngest male employee in hr?
		Optional<Employee> youngestMale = employeeList.stream().filter(e ->e.gender=="male"&&e.getDepartment()=="hr").collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		System.out.println(youngestMale.get().name);
		System.out.println("===================================");
		//9. Who is the most having experience in the organization?
		Optional<Employee> mostexp = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		System.out.println(mostexp.get().name);
		System.out.println("===================================");
		//10. How many males and females employees in sales?
		Map<String, Long> salesDept = employeeList.stream().filter(e->e.getDepartment()=="sales"&&e.getDepartment()=="hr").collect(Collectors.groupingBy((Employee::getGender),Collectors.counting()));
		System.out.println(salesDept);
		System.out.println("===================================");
		//11. What is the average salary of Male and Female Employees ?
		Map<String, Double> MandFAvg = employeeList.stream().collect(Collectors.groupingBy((Employee::getGender),Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(MandFAvg);
		System.out.println("===================================");
		//12. List down the names of all employees in each department ?
		Map<String, List<Employee>> listNames = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String,List<Employee>>> entrySet = listNames.entrySet();
		for( Entry<String,List<Employee>> entry:entrySet) {
			System.out.println("Employes in = "+entry.getKey()+" : ");
		List<Employee> list = entry.getValue();
		for(Employee e : list) {
			System.out.println(e.getName());
		}
		}
		//13. What is the average salary and Total Salary of whole organization ?
		DoubleSummaryStatistics Avg = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average salary = "+Avg.getAverage());
		System.out.println("Total salary = "+Avg.getSum());
		System.out.println("===================================");
		//14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years?
		//15. Who is the oldest employee in the organization ?
		Optional<Employee> oldest = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		System.out.println(oldest.get().name);
		System.out.println("===================================");
		//16)who is the second highest salary employee
		employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).forEach(System.out::print);
	}
}

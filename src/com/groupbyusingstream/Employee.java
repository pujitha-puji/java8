package com.groupbyusingstream;

public class Employee {
	int id;
	String name;
	double salary;
	String country;
	public Employee(int id, String name, double salary, String country) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}
	

}

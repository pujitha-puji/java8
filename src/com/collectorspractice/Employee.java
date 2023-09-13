package com.collectorspractice;

public class Employee {
	int idno;
	String name;
	double salary;
	public Employee(int idno, String name, double salary) {
		this.idno = idno;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [idno=" + idno + ", name=" + name + ", salary=" + salary + "]";
	}
	

}

package com.streamApi;

public class User {
	String name;
	int age;
	User(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+" "+"is"+" "+age;
	}

}

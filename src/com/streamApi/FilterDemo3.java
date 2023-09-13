package com.streamApi;

import java.util.stream.Stream;

public class FilterDemo3 {
	public static void main(String[] args) {
		User u1 = new User("Mohan", 25);
		User u2 = new User("Mahesh", 30);
		User u3 = new User("Raju", 15);
		User u4 = new User("Rani", 10);
		User u5 = new User("Sanjay", 35);
		User u6 = new User("Ashok", 30);
		
		Stream<User> stream = Stream.of(u1,u2,u3,u4,u5,u6);
		
		//stream.filter(u -> u.age >=18).forEach(u -> System.out.println(u));
		
		//stream.filter(u -> u.age >=18 && u.name.startsWith("M")).forEach(u -> System.out.println(u));
		
		stream.filter(u -> u.age >=18).filter(u -> u.name.startsWith("M")).forEach(u->System.out.println(u));
	}

}

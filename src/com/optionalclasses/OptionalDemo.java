package com.optionalclasses;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		/*Customer customer = new Customer(111, "Mohan", "mohan@gmail.com");
		String email = customer.getEmail();
		System.out.println(email);*/
		
		/*
		 * Customer customer = new Customer(111, "Mohan", null); 
		 * String email = customer.getEmail(); 
		 * System.out.println(email);
		 */
		
		
		//when u know that optional container is never null
		/*
		 * Customer customer = new Customer(111, "Mohan", "mohan@gmail.com");
		 * Optional<String> email = Optional.of(customer.getEmail());
		 * System.out.println(email);
		 */
		
		//when u know that optinal container is either null or contains some values
		/*
		 * Customer customer = new Customer(111, "Mohan", null);
		 *  Optional<String> email = Optional.ofNullable(customer.getEmail()); 
		 *  System.out.println(email);
		 */
		
		/*
		 * Customer customer = new Customer(111, "Mohan", null); 
		 * Optional<String> email = Optional.ofNullable(customer.getEmail()); if(email.isPresent()) {
		 * System.out.println(email.isPresent()); 
		 * }else {
		 * System.out.println("not present"); }
		 */
		
		/*
		 * Customer customer = new Customer(111, "Mohan", null);
		 *  Optional<String> email = Optional.ofNullable(customer.getEmail());
		 * System.out.println(email.orElse("no mail found"));
		 */
		
		/*
		 * Customer customer = new Customer(111, "Mohan", null); 
		 * Optional<String> email = Optional.ofNullable(customer.getEmail());
		 * System.out.println(email.orElseGet(() -> "no email found"));
		 */
		
		/*
		 * Customer customer = new Customer(111, "Mohan", "mohan@gmail.com");
		 * Optional<String> email = Optional.ofNullable(customer.getEmail());
		 * System.out.println(email.orElseThrow(()-> new IllegalArgumentException("email data not found")));
		 */
		Customer customer = new Customer(111, "Mohan", null);
		Optional<String> email = Optional.ofNullable(customer.getEmail());
		System.out.println(email.map(String::toUpperCase).orElseGet(()->"where is ur mail id go back and check it"));
	}
}

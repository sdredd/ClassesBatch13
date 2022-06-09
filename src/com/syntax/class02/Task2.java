package com.syntax.class02;

public class Task2 {

	public static void main(String[] args) {
		
		String name = "Nataly";
		String lastName = "Tolkacheva";
		char grade = 'A';
		String city = "Niceville";
		String state = "Florida";
		String phone = "333-444-5555";
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in city "+city+" and state "+state);
		System.out.println("And my phone number is "+phone);
		
		city = "New York";
		state = "NY";
		phone = "999-555-0000";
		grade = 'B';
		
		System.out.println("My name is "+name+" and I moved to new city "+city+" and new state "+state);
		System.out.println("My new number is "+phone);

	}

}

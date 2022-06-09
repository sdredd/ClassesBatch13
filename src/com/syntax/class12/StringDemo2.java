package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Adem";
		String lastName=" Jones";
		String fullName=firstName+lastName; //prefer way
		String fullName2=firstName.concat(lastName); // never use - NullPointer exception
		System.out.println(fullName);
		System.out.println(fullName2);
		
		String name=" ";
		System.out.println(name.isEmpty());
		
		String str=" never ";
		System.out.println(str.trim());

	}

}

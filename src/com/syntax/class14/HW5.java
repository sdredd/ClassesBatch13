package com.syntax.class14;

public class HW5 {
	/*
	 * Create a method createEmail(). Based on values of users name, 
	 * lastName and email type, your method should return complete email Address. 
	 * Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
	 */
	
	void createEmail(String a, String b, String c) {
		System.out.println(a.toLowerCase()+b.toLowerCase()+"@"+c+".com");
	}

	public static void main(String[] args) {
		HW5 outHw5=new HW5();
		
		outHw5.createEmail("Natalia", "Tolkacheva", "gmail");

	}

}

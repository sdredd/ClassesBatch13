package com.syntax.class04;

public class Task4 {

	public static void main(String[] args) {
		
		double rate=3.5;
		int price;
		
		if (rate>4.5) {
			System.out.println("user will not buy a house");
		} else {
			System.out.println("user decides to buy a house. What price?");
			
			price = 100000;
			
			if (price>50000) {
				System.out.println("user will take a loan");
			} else {
				System.out.println("user will pay cash");
			}
		}
		System.out.println("Thank you for contacting us!");

	}

}

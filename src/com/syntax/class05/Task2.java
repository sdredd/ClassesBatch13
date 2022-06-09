package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		String card=input.next();
		
		if (card.equals("yes")) {
			
			System.out.println("What is balance on the card?");
			int balance=input.nextInt();
			
			if (balance>1000) {
				System.out.println("Pay off immediately");
			} else {
				System.out.println("You can spend more");
			}
			
		} else {
			System.out.println("Let's get a credit card");
		}

	}

}

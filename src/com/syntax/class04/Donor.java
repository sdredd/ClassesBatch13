package com.syntax.class04;

import java.util.Scanner;

public class Donor {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is your age");
		
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println("What is your weight?");
			int weight=input.nextInt();
			
			if (weight>=110) {
				System.out.println("You are eligible to donate your blood");
			} else {
				System.out.println("Sorry, we cannot accept you");
			}
		} else {
			System.out.println("You are not aligible to donate your blood");
		}
		

	}

}

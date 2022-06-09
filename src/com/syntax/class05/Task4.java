package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number of day");
		int day=input.nextInt();
		
		if (day>0 && day<=5) {
			System.out.println("It is a weekday");
		} else if (day>5 && day<7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}

	}

}

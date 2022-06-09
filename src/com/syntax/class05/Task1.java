package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is your age?");
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println("We give you a drive license");
		} else {
			System.out.println("You will need to get a learners permit");
		}
		
	}

}

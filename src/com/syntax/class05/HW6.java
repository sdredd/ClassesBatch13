package com.syntax.class05;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your quiz score");
		int quiz = input.nextInt();

		System.out.println("Enter your mid term score");
		int mid = input.nextInt();

		System.out.println("Enter your final score");
		int fin = input.nextInt();

		int grade = (quiz + mid + fin) / 3;
		char gr = ' ';

		if (grade >= 90) {
			gr = 'A';
		} else if (grade >= 70 && grade < 90) {
			gr = 'B';
		} else if (grade >= 50 && grade < 70) {
			gr = 'C';
		} else if (grade < 50) {
			gr = 'F';
		}

	
		System.out.println("Your grade " + gr);

		if (gr == 'A' || gr == 'B') {
			System.out.println("You are doing great");
		} else {
			System.out.println("Please try to study more");
		}

	}
}

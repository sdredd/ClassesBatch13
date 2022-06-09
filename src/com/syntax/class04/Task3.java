package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {

		boolean diplom = true;
		double gpa = 4.6;

		System.out.println("Do you have diplom?");

		if (diplom) {

			System.out.println("Congratulation");
			System.out.println("Lets check your GPA");

			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("You need to get diplom");
		}

	}

}

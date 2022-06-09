package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {
			System.out.println("Check how many doses you have");
			if (dose == 1) {
				System.out.println("You need one more shot");
			} else if (dose == 2) {
				System.out.println("Great");
			}
		}

		System.out.println("_______________________");

		String month = "June";
		int day = 19;

		if (month.equals("May")) {
			
			System.out.println("What is day today?");
			
			if (day == 8) {
				System.out.println("Today Mothers day");
			} else {
				System.out.println("Today is regular day");
			}
			
		} else if (month.equals("June")) {
			
			System.out.println("What is day today?");
			
			if (day == 19) {
				System.out.println("Today Fathers day");
			} else {
				System.out.println("Today is regular day");
			}
			
		} else {
			
			System.out.println("It is " + month);
		}

	}

}

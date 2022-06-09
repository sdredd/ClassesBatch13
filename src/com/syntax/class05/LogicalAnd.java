package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {

		boolean job = true;
		double salary = 75000;

		if (job && salary >= 100000) {
			System.out.println("I am super duper happy");
		}

		boolean study = true;
		boolean homework = false;
		boolean practice = true;

		if (study && homework && practice) {
			System.out.println("You will succeed in the course");
		} else {
			System.out.println("You will struggle");
		}

		int num1 = 70;
		int num2 = 66;
		int num3 = 80;

		if (num1 > num2 && num1 > num3) {
			System.out.println("The lagest number is " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The lagest number is " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("The lagest number is " + num3);
		}

	}

}

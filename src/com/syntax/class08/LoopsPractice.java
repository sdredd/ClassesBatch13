package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {

		// find sum of all even and odd numbers 1 to 70

		int sum = 0;

		for (int i = 1; i <= 70; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("sum of even numbers is " + sum);

		System.out.println("----------------");

		int odd = 0;

		for (int i = 1; i <= 70; i++) {
			if (i % 2 != 0) {
				odd += i;
			}
		}
		System.out.println("sum of odd numbers is " + odd);

		System.out.println("----------------");

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= 70; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println("sum of even numbers is " + sumEven);
		System.out.println("sum of odd numbers is " + sumOdd);
	}

}

package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {
		// Print numbers from 1 to 100 in 1 line with space

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Print numbers from 100 to 1

		for (int a = 100; a >= 1; a--) {
			System.out.print(a + " ");
		}
		System.out.println();

		// Print even numbers from 20 to 1 (2 ways)

		for (int t = 20; t >= 1; t -= 2) {
			System.out.print(t + " ");
		}
		System.out.println();

		for (int r = 20; r >= 1; r--) {
			if (r % 2 == 0) {
				System.out.print(r + " ");
			}
		}
		System.out.println();

		// Print odd numbers between 20 and 50 (2 ways)

		for (int s = 21; s <= 50; s += 2) {
			System.out.print(s + " ");
		}
		System.out.println();

		for (int f = 20; f <= 50; f++) {
			if (f % 2 == 1) {
				System.out.print(f + " ");
			}
		}
		System.out.println();
		
		

	}

}

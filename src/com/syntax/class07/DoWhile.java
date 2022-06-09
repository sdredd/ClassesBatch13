package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {

		int num = 1;

		while (num <= 3) {
			System.out.print(num + " ");
			num++;
		}

		System.out.println();
		System.out.println("-----------------");

		int num1 = 1;
		do {
			System.out.print(num1 + " ");
			num1++;
		} while (num1 <= 3);

		// 1 to 30 using do while

		int a = 1;

		do {
			System.out.print(a + " ");
			a++;
		} while (a <= 30);

		System.out.println();
		System.out.println("-----------------");

		// 70 to 30 even

		int s = 70;

		do {
			if (s % 2 == 0) {
				System.out.print(s + " ");
			}
			s--;

		} while (s >= 30);
		
		System.out.println();
		System.out.println("-----------------");

	}
	

}

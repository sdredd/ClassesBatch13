package com.syntax.class08;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter end number");
		int end = input.nextInt();

		if (end < 0) {
			System.out.println("no output");
		}

			for (int i = 0; i < end * 2; i++) {
				if (i >= 0) {
					System.out.print(i + " ");
				}
			}

		

	}

}
package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// secret number
		// ask user to guess your secret number

		Scanner input = new Scanner(System.in);

		int sec = 123;
		int num = 0;

		do {
			System.out.println("guess your secret number");
			num = input.nextInt();
		} while (num != sec);

		System.out.println("Secret number is " + num);

	}

}

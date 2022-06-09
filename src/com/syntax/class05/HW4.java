package com.syntax.class05;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your current time?");
		double time = input.nextDouble();

		if (time > 0 && time < 12) {
			System.out.println("Morning");
		} else if (time >= 12 && time < 16) {
			System.out.println("Afternoon");
		} else if (time >= 16 && time < 21) {
			System.out.println("Evening");
		} else if (time >= 21 && time < 24) {
			System.out.println("Night");
		} else {
			System.out.println("Invalid value");
		}

	}

}

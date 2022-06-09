package com.syntax.class10;

import java.util.Scanner;

public class HWGroup02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How many countries do you want to enter?");
		int size = input.nextInt();
		input.nextLine();
		String capital = "";

		String[] countries = new String[size];

		for (int a = 0; a < size; a++) {
			System.out.println("Enter name of country");
			String country = input.nextLine();
			countries[a] = country;
		}

		int i = 0;
		while (i < countries.length) {

			switch (countries[i].toLowerCase()) {
			case "russia":
				capital = "Moscow";
				break;

			case "austria":
				capital = "Vienna";
				break;

			case "belarus":
				capital = "Minsk";
				break;

			case "china":
				capital = "Beijing";
				break;

			case "Egypt":
				capital = "Cairo";
				break;

			default:
				capital = "Unknown";
			}

			System.out.println("The capital of " + countries[i] + " is " + capital);
			i++;
		}
		
		input.close();

	}

}

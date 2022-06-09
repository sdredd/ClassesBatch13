package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your country");
		String country = input.nextLine();

		String language;

		switch (country.toLowerCase()) {

		case "russia":
			language = "russian";
			break;

		case "usa":
			language = "inglish";
			break;

		case "France":
			language = "franch";
			break;

		default:
			language = "Unknown";

		}
		System.out.println("You live in "+country+". You language is "+language);

	}

}

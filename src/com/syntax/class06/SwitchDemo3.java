package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String country, favoriteFood;

		System.out.println("Where are you from?");
		country = input.nextLine();

		switch (country.toLowerCase()) {

		case "russia":
			favoriteFood = "Pelmeni";
			break;

		case "ukraine":
			favoriteFood = "Borsh";
			break;

		case "usa":
			favoriteFood = "Burger";
			break;

		case "mexico":
			favoriteFood = "Tacos";
			break;

		case "canada":
			favoriteFood = "poutine";
			break;

		case "turkey":
			favoriteFood = "Lahmacun";
			break;

		case "pakistan":
			favoriteFood = "Pati chai";
			break;

		case "egypt":
			favoriteFood = "Koshary";
			break;

		default:
			favoriteFood = "Unknown";
			break;
		}
		
		System.out.println("You are from "+country+" your favorite food " +favoriteFood);

	}

}

package com.syntax.class06;

import java.util.Scanner;

public class HW4Sale {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double discount = 0;
		String name = "0%";
		double price = 0;

		System.out.println("Is there sale today?");
		String sale = input.nextLine();


		if (sale.equalsIgnoreCase("yes")) {
			
			System.out.println("Which item do you want to buy?");
			String item = input.nextLine();
			System.out.println("What price of this item?");
			price = input.nextDouble();

			if (price < 20) {
				name = "10%";
				discount = price * 0.9;
				
			} else if (price >= 20 && price < 100) {
				name = "20%";
				discount = price * 0.8;
				
			} else if (price >= 100 && price < 500) {
				name = "30%";
				discount = price * 0.7;
				
			} else {
				name = "50%";
				discount = price * 0.5;
			}
			
			System.out.println(
					"After discount " + name + " the price of the item reduce from " + price + " to " + discount);
		
		} else if (sale.equalsIgnoreCase("no")) {
			System.out.println("I am not going to shopping");
		
		} else {
			System.out.println("I do not undestand you");
		}
	}

}

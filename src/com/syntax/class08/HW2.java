package com.syntax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter item what you want to buy?");
		String item = input.nextLine();

		System.out.println("What price of " + item + "?");
		double price = input.nextInt();

		double money = 0;
		double amount = 0;
		double change = 0;

		do {
			System.out.println("Give me money");
			money = input.nextDouble();
			amount += money;

			if (amount < price) {
				change = price - amount;
				System.out.println("You have to pay " + change + "$ more");
			
			} else {
				break;
			}

		} while (price > amount);

		
		if (price == amount) {
			System.out.println("Thank you for shopping!");
		
		} else {
			change = amount - price;
			System.out.println("Your change is " + change + "$ Thank you for shopping!");
		}

	}

}

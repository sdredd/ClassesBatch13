package com.syntax.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("what is the amount of loan you need?");
		int amount=input.nextInt();
		
		if (amount<=200000) {
			System.out.println("We would lend the money");
		} else {
			System.out.println("We would reject the client");
		}

	}

}

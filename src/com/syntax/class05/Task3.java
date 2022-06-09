package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter person heights in inches");
		int h=input.nextInt();
		
		if (h>0 && h<60) {
			System.out.println("You are shot");
		} else if (h>=60 && h<72) {
			System.out.println("You are medium");
		} else if (h>=72) {
			System.out.println("You are tall");
		}

	}

}

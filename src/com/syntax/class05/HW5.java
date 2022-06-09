package com.syntax.class05;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your birth month");
		String m=input.next();
		
		if (m.equalsIgnoreCase("January") || m.equalsIgnoreCase("February") || m.equalsIgnoreCase("Desember")) {
			System.out.println("Season is Winter");
		
		} else if (m.equalsIgnoreCase("March") || m.equalsIgnoreCase("April") || m.equalsIgnoreCase("May")) {
			System.out.println("Season is Spring");
		
		} else if (m.equalsIgnoreCase("June") || m.equalsIgnoreCase("July") || m.equalsIgnoreCase("August")) {
			System.out.println("Season is Summer");
		
		} else if (m.equalsIgnoreCase("September") || m.equalsIgnoreCase("October") || m.equalsIgnoreCase("November")) {
			System.out.println("Season is Fall");
		} else {
			System.out.println("Invalid value");
		}

	}

}

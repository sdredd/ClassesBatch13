package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter numbers of worked years");
		int work=input.nextInt();
		
		if (work>=5) {
			System.out.println("You are eligible for the bonus");
			
			System.out.println("Enter annual salary");
			int sal=input.nextInt();
			
			if (sal>=50000) {
				System.out.println("Your bonus will be 5000");
			} else {
				System.out.println("Your bonus will be 3000");
			}
		
		} else {
			System.out.println("You are not eligible for the bonus");
		}

	}

}

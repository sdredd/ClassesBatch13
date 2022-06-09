package com.syntax.class04;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Enter your number");
		int a=input.nextInt();
		
		if (a%2==0) {
			System.out.println("Number "+a+" is even");
		} else {
			System.out.println("Number "+a+" is odd");
		}

	}

}

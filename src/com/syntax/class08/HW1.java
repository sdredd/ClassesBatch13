package com.syntax.class08;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		//Write a program that reads a range of integers (start and end point),
		//provided by a user and then from that range
		//the sum of the even and odd integers.
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter start point");
		int start=input.nextInt();
		System.out.println("Enter end point");
		int end=input.nextInt();
		
		int sumEven=0;
		int sumOdd=0;
		
		while (start<=end) {
			if(start%2==0) {
				sumEven+=start;
			} else {
				sumOdd+=start;
			}
			start++;
		}
		System.out.println("Sum of the even numbers = "+sumEven);
		System.out.println("Sum of the odd numbers = "+sumOdd);

	}

}

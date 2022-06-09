package com.syntax.class08;

import java.util.Scanner;

public class HW1negative {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter start point");
		int start = input.nextInt();
		System.out.println("Enter end point");
		int end = input.nextInt();

		int sumEven = 0;
		int sumOdd = 0;
		
		if(start<=end) {

		while (start <= end) {
			if (start % 2 == 0) {
				sumEven += start;
			} else {
				sumOdd += start;
			}
			start++;
		}
		
		} else {
			
			for (int i=start; start >= end; start--) {
				if (start % 2 == 0) {
					sumEven += start;
				} else {
					sumOdd += start;
				}
			}
		}
		
		System.out.println("Sum of the even numbers = " + sumEven);
		System.out.println("Sum of the odd numbers = " + sumOdd);

	}

}

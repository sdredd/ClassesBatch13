package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {

		int[] num = { 11, 7, 5, 9, 3, 12 };
		int largest = num[0];

		for (int x : num) {

				if (x > largest) {
					largest = x;
				}
			}
		
		System.out.println(largest);

	}

}

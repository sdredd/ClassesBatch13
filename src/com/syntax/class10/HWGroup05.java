package com.syntax.class10;

public class HWGroup05 {

	public static void main(String[] args) {
		
		int [] [] array= {
				{1,2,3,4,5},
				{6,7,8,9},
				{10,11,12,13,14,15,16},
		};
		int sumOdd=0;
		int sumEven=0;
		
		for (int a=0; a<array.length; a++) {
			for (int b=0; b<array[a].length; b++) {
				if (array[a][b]%2==0) {
					sumOdd+=array[a][b];
				} else {
					sumEven+=array[a][b];
				}
			}
		}
		System.out.println("Sum of odd numbers = "+sumOdd);
		System.out.println("Sum of even numbers = "+sumEven);

	}

}

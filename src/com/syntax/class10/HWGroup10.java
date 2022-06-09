package com.syntax.class10;

public class HWGroup10 {

	public static void main(String[] args) {

		int[] array = { 67, 4, 7, 5, 47, 1, 90, 34 };

		int lagest = array[0];
		int secLagest = array[0];

		for (int b = 1; b < array.length; b++) {

			if (lagest < array[b]) {
				lagest = array[b];
			}
		}

		for (int b = 0; b < array.length; b++) {

			if (array[b] > secLagest && array[b] < lagest) {
				if (lagest != secLagest) {
					secLagest = array[b];
				}
			}
		}
		System.out.println("The second lagest number in array is "+secLagest);

	}

}


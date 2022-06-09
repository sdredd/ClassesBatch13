package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] numbers = new int[3][4];

		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 40;

		numbers[1][0] = 1;
		numbers[1][1] = 2;
		numbers[1][2] = 3;
		numbers[1][3] = 4;

		numbers[2][0] = 9;
		numbers[2][1] = 8;
		numbers[2][2] = 7;
		numbers[2][3] = 6;

		System.out.println(numbers[1][3]);
		System.out.println(numbers[0][1]);
		
		int rows= numbers.length;
		System.out.println("Numbers of rows "+rows);
		
		int coldOf1Row=numbers[0].length;
		System.out.println("Number of cols in 1 row "+coldOf1Row);

	}

}

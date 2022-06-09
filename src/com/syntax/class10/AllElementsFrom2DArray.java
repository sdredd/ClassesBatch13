package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		
		String[][] usa = { { "New York", "Albany", "Buffalo" },
				{ "Los Angeles", "San Frans", "San Jose", "San Diego", "Redding" },
				{ "Miami", "Orlando", "Niceville", "Tampa" }, 
				{ "McLean", "Richmond", "Leeburg" }, };
		
		for (int row=0; row<usa.length; row++) {
			for (int cols=0; cols<usa[row].length; cols++) {
				System.out.print(usa[row][cols]+" ");
			}
			System.out.println();
		}

	}

}

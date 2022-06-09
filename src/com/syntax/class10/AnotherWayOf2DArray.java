package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {

		String[][] usa = { { "New York", "Albany", "Buffalo" },
				{ "Los Angeles", "San Frans", "San Jose", "San Diego", "Redding" },
				{ "Miami", "Orlando", "Niceville", "Tampa" }, 
				{ "McLean", "Richmond", "Leeburg" }, };
		
		System.out.println(usa[1][2]);
		System.out.println(usa[2][0]);
		
		System.out.println("Total # of 1d arrays is "+usa.length);
		
		System.out.println("Elements of 1 array "+usa[1].length);
		
		System.out.println("----------------");
		
		for(String[] state:usa) {
			for (String city:state) {
				System.out.print(city+" ");
			}
			System.out.println();
		}

	}

}

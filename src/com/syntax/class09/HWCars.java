package com.syntax.class09;

public class HWCars {

	public static void main(String[] args) {
		
		String [] car=new String[4];
		car [0] = "Nissan";
		car [1] = "Honda";
		car [2] = "GMS";
		car [3] = "BMW";
		for (int i=0; i<car.length; i++) {
			System.out.print(car[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------");
		
		String[] cars = {"Nissan", "BMW", "Mersedes", "Maclaren"};
		for (String a:cars) {
			System.out.print(a+" ");
		}

	}

}

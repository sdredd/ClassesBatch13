package com.syntax.class14;

public class HW2 {
	//Create a method that will take a number 
	//and prints whether the number is even or odd.
	
	void evenOrOdd (int a) {
		if (a%2==0) {
			System.out.println(a+" is even");
		} else {
			System.out.println(a+" is odd");
		}
	}

	public static void main(String[] args) {
		HW2 out=new HW2();
		
		out.evenOrOdd(8);

	}

}

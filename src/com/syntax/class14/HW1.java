package com.syntax.class14;

public class HW1 {
	// Create a method that will take 2 parameters as a numbers 
	//and prints which number is larger.
	
	void lagest (int a, int b) {
		if (a>b) {
			System.out.println(a+" is lager then "+b);
		} else if (b>a) {
			System.out.println(b+" is lager then "+a);
		} else {
			System.out.println(a+" equal to "+b);
		}
	}

	public static void main(String[] args) {
		HW1 out=new HW1();
		
		out.lagest(2, 7); 

	}

}

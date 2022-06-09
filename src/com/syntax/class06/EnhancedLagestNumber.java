package com.syntax.class06;

public class EnhancedLagestNumber {

	public static void main(String[] args) {
		
		int num1 = 70;
		int num2 = 66;
		int num3 = 80;
		
		int lag;

		if (num1 > num2 && num1 > num3) {
			lag=num1;
			
		} else if (num2 > num1 && num2 > num3) {
			lag=num2;
			
		} else if (num3 > num1 && num3 > num2) {
			lag=num3;
			
		} else {
			lag=0;
		}
		
		if (lag!=0) {
		System.out.println("The lagest number is " + lag);
		} else {
			System.out.println("All numbers are equal");
		}
	}

}

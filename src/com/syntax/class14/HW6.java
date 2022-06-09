package com.syntax.class14;

public class HW6 {
	//Write a method to return whether given number is prime or not?
	
	boolean prime (int num) {
		
		boolean isPrime = true;
		if (num>1) {

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime =  false;
					break;
				}
			}
		} else {
			isPrime = false;
		}
		
		return isPrime;
		

	}
	

	public static void main(String[] args) {
		HW6 out=new HW6();
		
		System.out.println(out.prime(11));

	}

}

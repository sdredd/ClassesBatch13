package com.syntax.class02;

public class HW1 {

	public static void main(String[] args) {
		
		/* Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		 * Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____” */
		
		double a, b, sum, sub, mult, div;
		String sum1 = "sum";
		String s = "difference";
		String m = "multiply";
		String d = "divide";
		
		a = 8.4;
		b = 4.2;
		
		sum = a + b;
		sub = a - b;
		mult = a * b;
		div = a / b;
		
		System.out.println("The "+sum1+" of 2 numbers "+a+" and "+b+" is equal to "+sum);
		System.out.println("The "+s+" of 2 numbers "+a+" and "+b+" is equal to "+sub);
		System.out.println("The "+m+" of 2 numbers "+a+" and "+b+" is equal to "+mult);
		System.out.println("The "+d+" of 2 numbers "+a+" and "+b+" is equal to "+div);

	}

}

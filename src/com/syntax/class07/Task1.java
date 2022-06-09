package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		
		// Print even numbers from 20 to 100
		
		int a=20;
		
		while (a<=100) {
			if (a%2==0) {
				System.out.print(a+" ");
			}
			a++;
		}
		
		System.out.println();
		
		//Print only odd numbers from 100 to 1
		
		int b=100;
		
		while (b>=1) {
			if(b%2==1) {
				System.out.print(b+" ");
			}
			b--;
		}

	}

}

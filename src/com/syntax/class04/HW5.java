package com.syntax.class04;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your 1 number");
		int a=input.nextInt();
		
		System.out.println("Enter your 2 number");
		int b=input.nextInt();
		
		if (a>b) {
			System.out.println(a+" lagest then "+b);
		} else if (b>a) {
			System.out.println(b+" lagest then "+a);
		} else {
			System.out.println(a+" = "+b);
		}
		

	}

}

package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=input.nextInt();
		
		if (n>1 && n<=10) {
			System.out.println(n+" small number");
		} else if (n>10 && n<=100) {
			System.out.println(n+" medium number");
		} else if (n>100 && n<=1000) {
			System.out.println(n+" large number");
		} else {
			System.out.println(n+" I do not know what is it");
		}

	}

}

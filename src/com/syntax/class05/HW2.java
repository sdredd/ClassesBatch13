package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is your city?");
		String city=input.nextLine();
		
		System.out.println("What is temperature in Fahrenheit in your city?");
		int tem=input.nextInt();
		
		int cel;
		
		cel=(tem-32)*5/9;
		
		System.out.println("The temperature is the city "+city+" is "+cel);

	}

}

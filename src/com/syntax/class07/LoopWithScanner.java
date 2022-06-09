package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String job;
		do {
			System.out.println("did you get a job");
			job=input.nextLine();
		} while (!job.equalsIgnoreCase("yes"));
			
		System.out.println("Congratulations");	
		
	System.out.println();
	System.out.println("-----------------");

	
	
	String offer;
	System.out.println("did you get a job");
	offer=input.nextLine();
	
	while (!offer.equalsIgnoreCase("yes")) {
		System.out.println("did you get a job");
		offer=input.nextLine();
	}
	System.out.println("Congratulations");

	

}

}

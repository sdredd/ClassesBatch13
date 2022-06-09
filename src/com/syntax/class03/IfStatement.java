package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		double morgageRate=4.5;
		
		if (morgageRate>5) {
			System.out.println("I am not buying a house");
		}
		
		int num1=99;
		int num2=10;
		
		if (num1>num2) {
			System.out.println(num1+ " bigger than "+num2);
		}
		
		int temperature= 74;
		if (temperature>75) {
			System.out.println("I will go a walk");
		} else {
			System.out.println("I am going to study Java");
		}
		
		char gender = 'f';
		if (gender=='f') {
			System.out.println("You like shopping");
		} else {
			System.out.println("You like watching sports");
		}
		
		String browser="Chrome";
		if (browser.equals("Chrome")) {
			System.out.println("All test cases will be executed on chrome");
		} else {
			System.out.println(" I amnot executing any test cases");
		}

	}

}

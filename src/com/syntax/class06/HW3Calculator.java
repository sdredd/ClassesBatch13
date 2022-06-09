package com.syntax.class06;

import java.util.Scanner;

public class HW3Calculator {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		double result=0;
		
		System.out.println("Enter number 1");
		double num1=input.nextDouble();
		System.out.println("What operator do you want to use (*,/,+,-,%)");
		String oper=input.next();
		System.out.println("Enter number 2");
		double num2=input.nextDouble();
		
		if (oper.equals("*")) {
			result=num1*num2;
		} else if (oper.equals("/")) {
			result=num1/num2;
		} else if (oper.equals("+")) {
			result=num1+num2;
		} else if (oper.equals("-")) {
			result=num1-num2;
		} else if (oper.equals("%")) {
			result=num1%num2;
		} else {
			System.out.println("Error");
		}
		
		
		System.out.println(num1+""+oper+""+num2+"="+result);

	}

}

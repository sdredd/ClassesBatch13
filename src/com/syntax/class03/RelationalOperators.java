package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1!=num2);
		
		System.out.println(num1==num2); //false
		System.out.println(num1=num2); //reassign num1 - 22

		boolean result=100>200;
		System.out.println(result);
		
		int result1=100+200;
		System.out.println(result1);
		
		String result3="Emre"+10;
		System.out.println(result3);
		
		
		int num3=10;
		int num4=11;
		result=num3==num4;
		System.out.println(result);
		
		result=num3!=num4;
		System.out.println(result);
	}

}

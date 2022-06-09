package com.syntax.class14;

public class MethodsDemo4 {

	public static void main(String[] args) {
		MethodsDemo4 md=new MethodsDemo4();
		System.out.println(md.sumNumbers(10, 10));
		md.print("Java", 4);

	}
	
	int sumNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	void print(String name, int num) {
		for (int i=0; i<num; i++) {
		System.out.println(name);
		}
	}

}

package com.syntax.class14;

public class MethodsDemo {
	
	void printHello() {
		System.out.println("How rare you guys");
	}
	
	boolean returnTrue() {
		return true;
	}
	
	int returnInt() {
		return 10;
	}
	
	public static void main(String[] args) {
		MethodsDemo md=new MethodsDemo();
		md.printHello();
		
		int num=md.returnInt();
		System.out.println(num);
		System.out.println(md.returnInt());
	}

}

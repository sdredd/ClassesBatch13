package com.syntax.class14;

public class MethodDemo2 {
	
	void print() {
		for (int i=0; i<5; i++) {
			System.out.println("Batch 13 is great");
		}
	}
	
	void printManyTames(int times) {
		for (int i=0; i<times; i++) {
			System.out.println("Batch 13");
	}
	}
	
	public static void main(String[] args) {
		MethodDemo2 md=new MethodDemo2();
		md.print();
		md.printManyTames(3);
	}

}

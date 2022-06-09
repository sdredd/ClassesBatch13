package com.syntax.class14;

public class Task1 {
	
	boolean isEven(int number) {
		if (number%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean numbers(String word) {
		if (word.length()%2==0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Task1 mn=new Task1();
		
		System.out.println(mn.isEven(5));
		
		System.out.println(mn.numbers("Numbers"));

	}

}

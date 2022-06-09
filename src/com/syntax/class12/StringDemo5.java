package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String str="Natalia is beautiful";
		
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(5));
		
		
		
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		int counter=0;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='s' || str.charAt(i)=='S') {
				counter++;
			}
		}
		System.out.println("s appeared " +counter);

	}

}

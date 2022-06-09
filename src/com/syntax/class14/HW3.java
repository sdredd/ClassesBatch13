package com.syntax.class14;

public class HW3 {
	//Create a method that will print whether given String is palindrome or not.
	
	void palindrome (String a) {
		
		boolean palen=true;
		for (int i=0; i<a.length()/2; i++) {
			if (a.charAt(i)==a.charAt(a.length()-i-1)) {
				palen=true;
			} else {
				palen=false;
				break;
			}
		}
		if (palen) {
		System.out.println(a+" is palindrome");
		} else {
			System.out.println(a+" is NOT palindrome");
		}
	}

	public static void main(String[] args) {
		HW3 out=new HW3();
		
		out.palindrome("anssana");

	}

}

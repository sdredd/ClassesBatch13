package com.syntax.class09;

public class HWAnimals {

	public static void main(String[] args) {
		
		String [] an = {"cat", "dog", "monkey", "bear", "elephant"};
		
		for (int i=0; i<an.length; i++) {
			System.out.print(an[i]+" ");
		}
		System.out.println();
		System.out.println("--------------");
		
		for (String a:an) {
			System.out.print(a+" ");
		}

	}

}

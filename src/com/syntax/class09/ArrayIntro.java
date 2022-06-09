package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		//create an array
		int [] b = new int [4];
		
		//store values
		b[0] = 90;
		b[1] = 85;
		b[2] = 70;
		b[3] = 100;
		
		//access values from my array
		System.out.println(b[2]);
		
		System.out.println(b[1]+b[3]);
		
		System.out.println("------------------------");
		
		String [] name=new String[5];
		
		name[0]="Roman";
		name[1]="Krystina";
		name[2]="Natalia";
		name[3]="Sameer";
		name[4]="Reza";
		
		System.out.println("Ma classmate name "+name[3]);

	}

}

package com.syntax.class09;

public class HWDouble {

	public static void main(String[] args) {
		
		double [] num=new double[4];
		
		num[0] = 11.99;
		num[1] = 13.99;
		num[2] = 15.99;
		num[3] = 17.99;
		
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("---------------");
		
		for (double a:num) {
			System.out.print(a+" ");
		}

	}

}

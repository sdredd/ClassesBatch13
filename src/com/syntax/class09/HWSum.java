package com.syntax.class09;

public class HWSum {

	public static void main(String[] args) {
		
		int [] num= {3,6,8,10};
		int sum=0;
		
		for(int n:num) {
			sum+=n;
		}
		System.out.println("The sum of array = "+sum);

	}

}

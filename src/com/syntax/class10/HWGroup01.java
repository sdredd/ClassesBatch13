package com.syntax.class10;

public class HWGroup01 {

	public static void main(String[] args) {
		
		int[] nums= {1, 2, 3, 4, 5};
		int sum=0;
		
		for (int a=0; a<nums.length; a++) {
			sum+=nums[a];
		}
		
		System.out.println("Sum of array = "+sum);

	}

}

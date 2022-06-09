package com.syntax.class10;

public class HWGroup03 {

	public static void main(String[] args) {
		
		int [] [] nums= {
				{1,4,5},
				{3,2,5,6},
				{5,7},
		};
		int sum=0;
		
		for (int a=0; a<nums.length; a++) {
			for (int b=0; b<nums[a].length; b++) {
				sum+=nums[a][b];
			}
		}
		System.out.println(sum);

	}

}

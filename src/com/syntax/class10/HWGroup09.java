package com.syntax.class10;

public class HWGroup09 {

	public static void main(String[] args) {
		
		int [] num= {4,67,54,-3,23,8,67,55,456,89};
		int min=num[0];
		int max=num[0];
		
		for (int i=1; i<num.length; i++) {
			
			if (min>num[i]) {
				min=num[i];
			}
			if (max<num[i]) {
				max=num[i];
			}
		}
		System.out.println("Maximum number in the array is "+max);
		System.out.println("Minimum number in the array is "+min);

	}

}

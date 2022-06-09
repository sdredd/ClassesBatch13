package com.syntax.class10;

public class HWGroup04 {

	public static void main(String[] args) {
		
		int [] [] array= {
				{1,2,3,4},
				{5,6,7,8,9},
		};
		
		for (int a=0; a<array.length; a++) {
			for (int b=0; b<array[a].length; b++) {
				
				if (array[a][b]%2==0) {
					System.out.println(array[a][b]);
				}
			}
		}

	}

}

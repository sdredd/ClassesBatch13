package com.syntax.class13;

public class HW4 {

	public static void main(String[] args) {
		/*
		 * How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
		 */
		
		String str="his is sentence i want to reverse";
		
		int index1=0;
		
		for (int i=0; i<str.length(); i++) {
			
			if (str.charAt(i)==' '|| i==str.length()-1) {
				
				for (int j=i; j>=index1; j--) {
					System.out.print(str.charAt(j));
					
				}
				index1=i;
			}
			
		}
		
		String[] arr=str.split(" ");
		
		for (String s:arr) {
			System.out.println(new StringBuilder(s).reverse()+" ");
		}
		

	}

}

package com.syntax.class13;

public class HW5 {

	public static void main(String[] args) {
		/*
		 * How would you check if String is palindrome or not? aba=> true
            Abbc =>false
		 */
		
		String str="asdsa";
		boolean palindrome=true;
		int j=str.length()-1;
		
		for (int i=0; i<str.length()/2; i++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					palindrome=true;
				} else {
					palindrome=false;
					break;
				}
				j--;
			
		}
		System.out.println(palindrome);

	}

}

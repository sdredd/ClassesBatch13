package com.syntax.class13;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, numbers and special characters. 
		 * Find out how many Alphanumeric characters are there in the String.
		 */
		
		String str="asdfg123n+-0ljhs::::::345";
		
		String str2=str.replaceAll ("[^a-zA-Z0-9]", "");
		
		System.out.println(str2.length());
		
		

	}

}

package com.syntax.class13;

public class HW6 {

	public static void main(String[] args) {
		String a="Natalia";
		String c="Sergei";
		
	a=a+c;
	c=a.substring(0, a.length()-c.length());
	a=a.substring(c.length(), a.length());
	
	System.out.println(a);
	System.out.println(c);

	}

}

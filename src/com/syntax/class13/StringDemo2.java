package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String str="sjjfgdfwtueppcnbdvghk;;'KDWSsdf0";
		
		System.out.println(str.replaceAll("[0-9]", "#"));
		System.out.println(str.replaceAll("[a-z]", "#"));
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
		System.out.println(str.replaceAll("[^a-z]", "_"));
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "_"));
		
		str ="abcdefghijkl";
		System.out.println(str.replaceAll("[a-f]", "*"));
		
		str="sjjfgdfwtueppcnbdvghk;;'KDWSsdf0";
		System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));

	}

}

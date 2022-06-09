package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for (int i=0; i< grade.length; i++) {
		System.out.println(grade[i]);}
		
		System.out.println("------------------");
		
		String [] w=new String[5];
		
		w[0] = "Java";
		w[1] = "Saturday";
		w[2] = "day";
		w[3] = "coding";
		w[4] = "is";
		
		System.out.println(w[1]+" "+w[4]+" "+w[0]+" "+w[3]+" "+w[2]);

	}

}

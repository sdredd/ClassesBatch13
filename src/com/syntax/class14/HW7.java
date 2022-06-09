package com.syntax.class14;

public class HW7 {
	/*
	 * Create  class Student that will have a method getGrade. 
	 * Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
	 */
	
	void getGrade (int a) {
		char grade;
		if (a>90) {
			grade='A';
		} else if (a>80) {
			grade='B';
		} else if (a>70) {
			grade='C';
		} else if (a>50) {
			grade='D';
		} else {
			grade='F';
		}
		System.out.println(grade);
	}

	public static void main(String[] args) {
		HW7 out=new HW7();
		
		out.getGrade(96);

	}

}

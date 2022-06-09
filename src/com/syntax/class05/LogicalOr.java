package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day = "Monday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have a day off");
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("I have manual class");
		} else if (day.equals("Sunday") || day.equals("Saturday")) {
			System.out.println("I have Java class");
		} else {
			System.out.println("I have Reveiw class");
		}

	}

}

package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {

		int day = 3;
		String name;

		switch (day) {

		case 1:
			name = "Monday";
			break;

		case 2:
			name = "Tuesday";
			break;

		case 3:
			name = "Wedneday";
			break;

		case 4:
			name = "Thursday";
			break;

		case 5:
			name = "Friday";
			break;

		case 6:
			name = "Saturday";
			break;

		case 7:
			name = "Sunday";
			break;

		default:
			name = "Invalid";
			break;
		}

		if (!name.equals("Invalid")) {
			System.out.println("Today is " + name);
		} else {
			System.out.println("Enter correct value");
		}
	}

}

package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		char choice = 'M';
		String meaning;

		switch (choice) {

		case 'Y':
			meaning = "Yes";
			break;
		case 'N':
			meaning = "No";
			break;
		case 'M':
			meaning = "Maybe";
			break;
		default:
			meaning = "Default";
			break;
		}
		System.out.println(meaning);

	}

}

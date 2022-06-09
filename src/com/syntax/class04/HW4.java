package com.syntax.class04;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String name=input.next();
		
		System.out.println("What is your last name?");
		String lastName=input.next();
		
		System.out.println("In what state does you live?");
		String state=input.next();
		
		System.out.println(name+" "+lastName+" live in "+state+" state");

	}

}

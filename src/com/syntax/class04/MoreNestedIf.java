package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		boolean repl=true;
		int axem=10;
		
		if (repl) {
			
			System.out.println("Check how many repls you did?");
			
			if (axem>=15) {
				System.out.println("great job");
			} else if (15>axem && axem>=10) {
				System.out.println("good");
			} else if (axem<10) {
				System.out.println("Try complete all tasks");
			}
		} else {
			System.out.println("You should complete you Repl HW");
		}

	}

}

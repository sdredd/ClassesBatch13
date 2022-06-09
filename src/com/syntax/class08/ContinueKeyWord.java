package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {
		
		//continue
		
		for (int i=1; i<=5; i++) {
			
			if (i==2) {
			continue;
			}
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		//print numbers 1-10 exept 5 and 7
		
		for (int i=1 ; i<=10; i++) {
			
			if (i==5 || i==7) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();

	}

}

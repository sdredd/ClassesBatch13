package com.syntax.class10;

public class HWGroup08 {

	public static void main(String[] args) {
		
		int firstNum=0;
		int secondNum=1;
		int next;
		
		System.out.print(firstNum+" "+secondNum);
		
		for (int i=1; i<=8; i++) {
			
			secondNum+=firstNum;
			System.out.print(" "+secondNum);
			firstNum=secondNum-firstNum;
		}
		
		

	}

}

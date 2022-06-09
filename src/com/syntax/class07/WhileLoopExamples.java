package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		int num=1;
		
		while (num<=10) {
			System.out.println(num+" ");
			num++;
		} 
		
		
		// print num 1 to 10
		
		int num1 =0;
		
		while (num1<10) {
			num1++;
			System.out.print(num1+" ");
		}
		
		// print num 1 to 100
		
		int num2=10;
		
		while (num2<=100) {
			System.out.println(num2);
			num2++;
		}
		
		// print num 10 to 1
		
		int b=10;
		while (b>0) {
			System.out.println(b);
			b--;
		}
		System.out.println();
		//100 to 50
		
		int c=100;
		
		while (c>=50) {
			System.out.print(c+" ");
			c--;
		}
		
		System.out.println();
		System.out.println("----------------");
		
		//-1 to -10
		
		int d=-1;
		while (d>=-10) {
			System.out.print(d+" ");
			d--;
		}
		System.out.println();
		//1 to 20 only even
		
		int v = 0;
		while (v<=20) {
			System.out.print(v+" ");
			v+=2;
		}
		
		
		System.out.println();
		System.out.println("----------------");
		
		int t=1;
		
		while (t<=20) {
			if (t%2==0) {
				System.out.print(t+" ");
			}
			t++;
		}

	}

}

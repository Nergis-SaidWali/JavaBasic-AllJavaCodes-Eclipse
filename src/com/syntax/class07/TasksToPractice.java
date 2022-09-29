package com.syntax.class07;

public class TasksToPractice {

	public static void main(String[] args) {
		//Print numbers from 100 to 1
		
		int i=100;
		
		while(i>=1) {
			System.out.print(i+" ");
			i--;
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		
		//Print even numbers from 20 to 100 
		
		int a=20;
		
		while(a<=100) {
			System.out.print(a+" ");
			a+=2;
		}
		
		
		System.out.println("-------------------------------------------------------------------------------");
		
		//Print only odd numbers from 100 to 1
		//(2 different ways)
		
		int b=99;
		 
		while(b>=1) {
			System.out.print(b+" ");
			b-=2;
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		int c=100;
		
		while(c>=1) {
			if(c%2==1) {
				System.out.print(c+" ");
			}
			c--;
		}
	


	}

}

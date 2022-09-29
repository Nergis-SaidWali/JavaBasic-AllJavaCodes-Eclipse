package com.syntax.class07;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String answer=null;
		do {
			System.out.println("Did you get a job?");
			answer=sc.next();
		}while(!answer.equalsIgnoreCase("yes"));
		System.out.println("Congratulations");
		
		
		
		
		
		
		
		

	}

}

package com.syntax.class12;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first
		 *names and if they expecting boy or girl? 
		 *Based on the input suggests a name for a baby:
		 *Example Output:
		 *Mom’s first name? Mary
		 *Dad’s first name? Daniel
		 *Boy or Girl? boy
		 *Suggested baby name: DANRY

		 *Example Output:
		 *Mom’s first name? Mary
		 *Dad’s first name? Daniel
		 *Boy or Girl? girl
		 *Suggested baby name: MAIEL
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter mom's name");
		String mom=input.nextLine();
		System.out.println("Please enter dad's name");
		String dad=input.nextLine();
		System.out.println("What is the gender?");
		char gender=input.next().charAt(0);
		
		if(gender=='M') {
			System.out.println((dad.substring(0, (dad.length()/2)).toUpperCase()+ (mom.substring((mom.length()/2), mom.length()).toUpperCase())));
		}else if(gender=='F') {
			System.out.println(((mom.substring(0, (mom.length()/2)).toUpperCase()+ dad.substring((dad.length()/2), dad.length()).toUpperCase())));
		}else {
			System.out.println("You entered invalid info");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElseExercise {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//we use nextInt() if we want an int type of data from the keyboard
		System.out.println("Please enter your age");
		
		int age=scan.nextInt();
		
		
		if(age<18)
		{
			System.out.println("You should study");
		}else {
			System.out.println("You should start working");
		}
 
	}

}

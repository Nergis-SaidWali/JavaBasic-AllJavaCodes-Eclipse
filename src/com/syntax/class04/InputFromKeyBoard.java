package com.syntax.class04;

import java.util.Scanner; //brings all the matter we need for Scanner from the library

public class InputFromKeyBoard {

	public static void main(String[] args) {
		/*
		 * Scanner is a class that helps us to take the input from the keyboard
		 * it contains many different smaller modules called methods that can help
		 * us take Strings booleans basically all types of data from the keyboardS
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=input.next();
		
		System.out.println("Hello "+name+" don't be confused");
	}

}

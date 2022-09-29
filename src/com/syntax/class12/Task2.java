package com.syntax.class12;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Create a String and if the String is not empty perform the following: 
		 * if the String has an odd number of characters and has 3 or more characters,
		 *  print the character in the middle of the String.
		 */
		int numChar=0;
		
		String str="objects";
		
		if(!str.isEmpty()) {
			numChar=str.length();
			if(numChar%2!=0 || numChar>=3) {
				System.out.println(str.charAt((str.length()/2)));
			}
		}else {
			System.out.println("There is no middle character");
		}
		
		
		
		
		
		
		

	}
	}


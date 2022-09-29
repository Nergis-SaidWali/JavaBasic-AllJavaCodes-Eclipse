package com.syntax.class13;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		//How would you check if String is palindrome or not? aba=> true
		//Abbc =>false
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a word");
		String str=input.next();
		
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
		
		boolean palindrome= true;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != reverse.charAt(i)) {
				palindrome= false;
			}
		}
		
		if(palindrome) {
			System.out.println("Palindrome!");
		}else {
			System.out.println("This is not a palindrome!");
		}

}

}

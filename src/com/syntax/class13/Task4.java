package com.syntax.class13;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
		 */

		
		String str="This is sentence I want to reverse"; //original String
		
		str.split(" "); // divide the string into 3 parts
		
		String[] words=str.split(" "); //make an array of separate words
		
		String reverseString="";
		
		for(String w:words) {
			
			String reverseWord="";
			for( int i=w.length()-1; i>=0; i--) {
				reverseWord=reverseWord+w.charAt(i);
			}
			reverseString=reverseString+reverseWord+ " ";
		}
		System.out.println(reverseString);
		
		
		
	}
}

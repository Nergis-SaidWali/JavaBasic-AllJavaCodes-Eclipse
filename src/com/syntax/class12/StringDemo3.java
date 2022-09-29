package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str=" i love java ";
		System.out.println(str);
		/*
		 * it will remove the spaces before and after the string 
		 * but not the ones which are present in between
		 */
		System.out.println(str.trim());
		
		String str2="Java is very easy";
		/*
		 * startsWith => checks if a String starts with a specific letter or word
		 * endsWith => checks if a String ends with a specific letter or word
		 * contains => checks if a String contains a specific letter or a word
		 */
		System.out.println(str2.startsWith("J"));
		System.out.println(str2.endsWith("y"));
		System.out.println(str2.contains("Very"));
		//Methods chaining helps us call multiple methods on a single line one method after the other
		System.out.println(str2.toLowerCase().contains("very"));
		

				
	}

}

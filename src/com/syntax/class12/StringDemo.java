package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		
		String str=new String("Java"); //Proper way of creating an object
		String name="Asma Alfadlhli The Great"; //only works for String and Wrapper classes //simpler and shorter way provided by Java 
		//creators to make our lives easier
		/*
		 * Counts the number of characters in a string including the spaces
		 */
		System.out.println(str.length());
		System.out.println(name.length());
		if(name.length()>15) {
			System.out.println("Name can't be more than 15 chaarcters");
		}
		
	}

}

package com.syntax.class02;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		
		//string is just one example of non primitive data types
		
		String name="Asma";
		
		String address="123 address street";
		
		String phone="123 456 7890";
		
		String age="17"; //anything you put inside double quotes becomes a string
		
		//ctrl+space -> auto completes the statement
		
		System.out.println(name);
		
		System.out.println("My name is "+name);
		
		System.out.println(name + " is " +age);
		
		
		String fruit ="apple";
		double price=1.99;
		
			
			//the price of the apple is 1.99
			
			System.out.println("The price of the "+ fruit + " is " + price);
			
			fruit="mango";
			price=5.99;	
				
				System.out.println("The price of the "+ fruit + " is " + price);
		/* to attach any value (int, double, boolean, char, String)
		 * to a String we use +
		 * + next to the String acts as Concatenation
		 */
			
			
			
	}

}

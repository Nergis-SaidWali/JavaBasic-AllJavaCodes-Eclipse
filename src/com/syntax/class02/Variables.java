package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Nergis";
		String surname="Said Wali";
		char grade='A';
		String city="Istanbul";
		long phonenumber=5319760951L;
		
		System.out.println("My name is "+ name +" and my last name is "+ surname );
		System.out.println("I am "+ grade+ " student");
		System.out.println("I live in "+ city);
		System.out.println("And my phone number is "+phonenumber);
		
		name="Ali";
		surname="Ilyas";
		grade='B';
		city="Ankara";
		phonenumber=5329870654L;
		
		System.out.println("My name is "+ name +" and my last name is "+ surname );
		System.out.println("I am "+ grade+ " student");
		System.out.println("I live in "+ city);
		System.out.println("And my phone number is "+phonenumber);
		
		//Rules for identifiers=names (variables, methods, classes)
		//1.cannot use keywords as identifiers
		//String new ="Hello"; -> get an error
		
		//2. cannot have spaces in identifiers
		//String last name="Smith"; -> error
		
		//identifiers cannot start with numbers
		//int 1number=123; ->error number can be anywhere after first place
		
		/*4.identifiers cannot contain any special character
		*except $ or _
		*/
		
		//boolean hello!=true; -> error
		
		double $price=9.98;
		float _price1=1.99F;
		
		/*
		 *naming conventions
		 * class should start with uppercase and follow camel casing
		 * variables should start with lowercase and follow camel casing
		 */
		
		String myWeather="cold";//preferred
		
		 
		
	}

}

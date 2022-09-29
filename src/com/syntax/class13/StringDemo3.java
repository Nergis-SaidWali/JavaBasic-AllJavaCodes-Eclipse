package com.syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str="sfksKAFBDAJKF11493!@#%$%$*$";
		
		//Replace all numbers from 0 to 9 with %
		System.out.println(str.replaceAll("[0-9]","%"));
		
		//Remove all numbers from 0-9
		System.out.println(str.replaceAll("[0-9]", ""));
		
		//Remove all lower case letter and replace with number 9
		System.out.println(str.replaceAll("[a-z]", "9"));
		
		//Do not remove upper case letter from A to Z, remove all refer the ascii table
		System.out.println(str.replaceAll("[^A-Z]", ""));
		
		//Do not remove lower case letter from a to z, upper case letter from A to Z and numbers from 0 to 9, remove all refer the ascii table
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

	}

}

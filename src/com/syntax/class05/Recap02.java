package com.syntax.class05;

public class Recap02 {
public static void main(String[] args) {
	//ctrl+shift+f checks the allignment
	
	boolean allergy=true;
	
	String allergyType="unknown";
	
	if (allergy) {
		System.out.println("Let's check what allergy you have");
		if (allergyType.equals("Pollen")) {
			System.out.println("Try to stay indoors when trees are blooming");
		} else if (allergyType.equals("Peanut")) {
			System.out.println("Please stay away from peanuts");
		} else if (allergyType.equals("Dairy")) {
			System.out.println("Stay away from dairy products");
		}else {
			System.out.println("We need to do some test");
		}		
		
	}else {
			System.out.println("You are lucky");
		}
	}
}



package com.syntax.class11;

public class Dog {

	//state
	//attributes/ properties/ fields
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	//behavior
	//Methods/ Functions
	void bark() {
		System.out.println("Barking.............");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping.............");
	}

	public static void main(String[] args) {
		//creating objects from a class
		Dog dog1=new Dog();
		//calling a behavior of an object
		dog1.bark();
		dog1.sleep();
	}
	
}

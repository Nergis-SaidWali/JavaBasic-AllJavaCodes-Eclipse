package com.syntax.class12;

public class Phone {

	/*
	 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors
	 */
	
	String make;
	String model;
	String color;
	int year;
	int storage;
	
	void makeCall() {
		System.out.println("Making a call using "+model);
	}
	
	void rakePictures() {
		System.out.println("Taking picture with "+model);
	}
	
	void browseInterner() {
		System.out.println("Browsing the internet using "+model);
	}
	
	
}

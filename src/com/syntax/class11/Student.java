package com.syntax.class11;

public class Student {
	
	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println("Student is studying");
	}
	void deleteMessages() {
		System.out.println("Deleting messages from Discord");
	}
	
	void eat() {
		System.out.println("Eating pizzzzzzza...");
	}

	public static void main(String[] args) {
		
		Student friadoonObject=new Student();
		friadoonObject.name="Friadoon";
		friadoonObject.id="123";
		friadoonObject.age=22;
		
		System.out.println(friadoonObject.name);
		System.out.println(friadoonObject.age);
		
		friadoonObject.study();
		friadoonObject.deleteMessages();
		friadoonObject.eat();
		
		System.out.println("--------------------------------------------------------------------------------");
		
		Student student2=new Student();
		student2.name="Asma";
		student2.age=16;
		student2.weight=30;
		student2.gender='F';
		
		System.out.println(student2.name);
		System.out.println(student2.age);
		
		student2.eat();
		
		
		
		
	}
	
	
	
	
}

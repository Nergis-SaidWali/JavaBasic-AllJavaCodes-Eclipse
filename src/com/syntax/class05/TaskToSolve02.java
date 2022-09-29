package com.syntax.class05;

import java.util.Scanner;

public class TaskToSolve02 {

	public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a day");
		String day=input.next();
		
		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
			System.out.println("It is a weekday");
		} else if(day.equals("saturday") || day.equals("sunday")) {
			System.out.println("It is a weekend");
		}
		else {
			System.out.println("Invalid day");
		}

	}

}

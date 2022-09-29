package com.syntax.class04;

public class NestedIF {

	public static void main(String[] args) {
		
		
		int time=5;
		String day="Monday";
		
		
		if(day.equals("Monday")) { //Outer if condition //main door, if it is true then only inner conditions will be checked,
			//if it is false nothing from the inner if-conditions will be executed
			// as String is a non primitive we can't use == sign we have to use .equals
			if(time>7) { //inner if condition
				System.out.println("Let's go to office");
			}
			
			if(time<6) { //inner if condition
				System.out.println("Let's sleep more");
			}
		}

	}

}

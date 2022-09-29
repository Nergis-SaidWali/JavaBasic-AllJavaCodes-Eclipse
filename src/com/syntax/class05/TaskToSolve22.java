package com.syntax.class05;

import java.util.Scanner;

public class TaskToSolve22 {

	public static void main(String[] args) {
		
		int day1 = 6;
        if(day1 >=1 && day1<=5) {
            System.out.println(" It is a weekday");
        }else if(day1 == 6 || day1 == 7 ) {
            System.out.println("It is a weekend.");
        }else {
            System.out.println("Invalid day");
        }
        
        System.out.println("--------------------");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number 1-7");
        int day = input.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("It is weekday");
        }else if (day == 6 || day == 7) {
            System.out.println("it is weekend");
        }else {
            System.out.println("Invalid day");
        }

        
        
        
        
	}

}

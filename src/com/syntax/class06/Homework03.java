package com.syntax.class06;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		/*
		 * 3.Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num1=input.nextInt();
		System.out.println("Please enter another number");
		int num2=input.nextInt();
		System.out.println("Please enter one of these operators +  -  /  *  %");
		char operator=input.next().charAt(0);
		int result = 0;
		
		switch(operator) {
			case '+':
				result=num1+num2;
				break;
			case '=':
				result=num1-num2;
				break;
			case '/':
				result=num1/num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '%':
				result=num1%num2;
				break;
			default:
				System.out.println("Invalid operator");
		}
		if(operator=='+' || operator=='-'|| operator=='/' || operator=='*' || operator=='%') {
		System.out.println("num1 is "+num1+" and num2 is "+num2+" Your result is "+result);
		}
		}
	}



package com.syntax.class06;

import java.util.Scanner;

public class Homework03IfElse {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num1=input.nextInt();
		System.out.println("Please enter another number");
		int num2=input.nextInt();
		System.out.println("Please enter an operator");
		char operator=input.next().charAt(0);
		int result = 0;
		
		if(operator=='+') {
			result=num1+num2;
		}else if(operator=='-') {
			result=num1-num2;
		}else if(operator=='/') {
			result=num1/num2;
		}else if(operator=='*') {
			result=num1*num2;
		}else if(operator=='%') {
			result=num1%num2;
		}else {
			System.out.println("Invalid operator");
		}
		System.out.println(result);
	}

}

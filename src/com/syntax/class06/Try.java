package com.syntax.class06;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Please Enter the Second number: ");
        int num2 = input.nextInt();

        System.out.println("What operation you want to perform?");
        String operators = input.next();

        int result = 0;

        switch(operators) {
        case "addition":
            result = num1 + num2;
            break;
        case "subtraction":
            result = num1 - num2;
            break;
        case "multiplication":
            result = num1*num2;
            break;
        case "division":
            result = num1 / num2;
            break;
        default:
            System.out.println("Invalid operator!!");
        }
        System.out.println("Your result  after "+operators+ " is: "+result);
    }

	}



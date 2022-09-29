package com.syntax.class05;

import java.util.Scanner;

public class TaskToSolve03 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println();
		
		int num1=input.nextInt();
		
		
		if(num1>1 && num1<10) {
			System.out.println(num1+ " is a small number");
		} else if (num1>11 && num1<100) {
			System.out.println(num1+" is a medium number");
		} else if (num1>101 && num1<1000) {
			System.out.println(num1+" is a large number");
		}
	}

}
 
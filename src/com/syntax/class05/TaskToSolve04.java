package com.syntax.class05;

import java.util.Scanner;

public class TaskToSolve04 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your current time");
		
		int time=input.nextInt();
		
		if(time>=1 && time<=11) {
			System.out.println("Morning");
		}else if(time>=12 && time<=15) {
			System.out.println("Afternoon");
		}else if(time>=16 && time<=20) {
			System.out.println("Evening");
		}else if(time>=21 && time<=24) {
			System.out.println("Night");
		}

	}

}

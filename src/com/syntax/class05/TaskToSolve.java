package com.syntax.class05;

import java.util.Scanner;

public class TaskToSolve {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your height");
			int height=input.nextInt();
			
			if(height<60) {
				System.out.println("You are short");
			}else if(height>60 && height<72) {
				System.out.println("You are medium");
			}else if(height>72) {
				System.out.println("You are tall");
			}
		}

	}



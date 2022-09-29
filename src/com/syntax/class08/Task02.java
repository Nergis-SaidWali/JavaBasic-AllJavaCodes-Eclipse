package com.syntax.class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// create a secret number and let user guess the secret number once user guessed your secret number ->programs says you won!
		
		Scanner input=new Scanner(System.in);
		
		int secretNum=78;
		int answer;
		do{
			System.out.println("Guess my secret number?");
			answer=input.nextInt();
		}while(answer!=secretNum);
		System.out.println("You won!");
		
		

	}

}

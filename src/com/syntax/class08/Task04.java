package com.syntax.class08;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item.
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off.
		 *  If user give more money program should return a change. Whenever user done with 
		 *  payments program should say "Thank you for shopping!"
		 */
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("What do you want to buy?");
		String item=input.nextLine();
		System.out.println("What is the price of the item?");
		double price=input.nextDouble();
		double money;
		
		
		do {
			System.out.println("How much money do you have?");
			money=input.nextDouble();
			if(money<price) {
				System.out.println("You need to pay "+ (price-money)+ "$more");
				System.out.println("-----------------------------------------------------------");
				continue;
			}else if(money>price) {
				System.out.println("Take your "+(money-price)+"$ back");
				System.out.println("-----------------------------------------------------------");
				continue;
			}
		}while(price!=money);
		System.out.println("Thank you for shopping!");
		
		
	}

}

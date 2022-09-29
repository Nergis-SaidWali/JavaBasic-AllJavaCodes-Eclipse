package homework04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		Boolean CreditCard=scan.nextBoolean();
		
		if(CreditCard){
			System.out.println("What is the balance on the card?");
			int balance=scan.nextInt();
			if(balance>1000) {
				System.out.println("Pay off immediately!");
			}else {
				System.out.println("You can spend more.");
			}
		} else {
			System.out.println("I offer you to buy a credit card.");
		}

	
	}
}

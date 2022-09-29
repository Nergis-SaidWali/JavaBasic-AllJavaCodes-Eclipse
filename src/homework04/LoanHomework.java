package homework04;

import java.util.Scanner;

public class LoanHomework {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("What is the amount of loan needed?");
		int loan=scan.nextInt();
		
		if(loan<=200000) {
			System.out.println("I can lend you the money.");
		}else {
			System.out.println("I reject the client.");
		}
		

	}

}

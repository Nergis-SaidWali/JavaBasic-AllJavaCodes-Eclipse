package homework04;

import java.util.Scanner;

public class MortgageHomework {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("What is your mortgage rate?");
		Double Mrate=scan.nextDouble();
		if(Mrate>4.5) {
			System.out.println("You will not buy a house.");
		}else {
			System.out.println("You consider buying a house.");
			System.out.println("What is your mortgage price?");
			int Mprice=scan.nextInt();
			if(Mprice>200000) {
				System.out.println("You should take a loan.");
			}else {
				System.out.println("You will pay cash.");
			}
		}
		
		 
		
	}

}

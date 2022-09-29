package homework04;

import java.util.Scanner;

public class DriverLicenceHomework {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("What is your age?");
		int age=scan.nextInt();
		
		if(age>=18) {
			System.out.println("I can issue a driver licence.");
		} else {
			System.out.println("Please, get a learners permit.");
		}
		

	}

}

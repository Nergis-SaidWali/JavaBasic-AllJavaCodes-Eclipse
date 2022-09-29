package homework04;

import java.util.Scanner;

public class WorkedYearsHomework {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many years have you worked so far?");
		int years=scan.nextInt();
		if(years>=5) {
			System.out.println("You are eligible for the bonus.");
			System.out.println("What is your salary?");
			double salary=scan.nextDouble();
			if(salary>50000) {
				System.out.println("Your bonus is 5000.");
			}else {
				System.out.println("Your bonus is 3000.");
			}
		} else {
			System.out.println("You are not eligible for the bonus.");
		}

	}

}

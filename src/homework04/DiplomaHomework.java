package homework04;

import java.util.Scanner;

public class DiplomaHomework {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have a diploma?");
		Boolean diploma=scan.nextBoolean();
		
		if(diploma) {
			System.out.println("Congratulations!");
			
			System.out.println("What is your GPA score?");

			double GPA=scan.nextDouble();
			if(GPA>=3.5) {
				System.out.println("You are eligible for a scholarship.");
			}else {
				System.out.println("You should have studied harder.");
			}
			
		}else {
			System.out.println("You should get a degree.");
		}
		
	}

}

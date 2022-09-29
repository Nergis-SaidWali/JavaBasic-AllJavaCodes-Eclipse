package HomeworkLoops;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		// Declare a variable to store a price for a coffee. 
		//Ask the user to pay for a coffee. 
		//Keep asking to pay for coffee until the user enters the EXACT amount .
		//If the user gives more than coffee price --> ask them to give less, 
		//if the user gives less money then ask to give more. Once user give EXACT amount print “Please enjoy your coffee
		
		Scanner input=new Scanner(System.in);
		double price;
		do {
			System.out.println("---------------------------");
			System.out.println("Please pay for the coffee");
		price=input.nextDouble();
			if(price<10) {
			System.out.println("Please give more");
			}else if(price>10) {
			System.out.println("Please give less");
			}
		}while(price!=10); 
			System.out.println("Please enjoy the coffee"); 
		}
	}



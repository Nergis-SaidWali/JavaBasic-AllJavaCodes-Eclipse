package HomeworkLoops;

import java.util.Scanner;

public class Homework06Again {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double price;
	
		
			System.out.println("Please pay for the coffee");
			price=input.nextDouble();
			if(price<10) {
			System.out.println("Please give more");
			}else if(price>10) {
			System.out.println("Please give less");
			}
		while(price==10) {
			System.out.println("Please enjoy the coffee"); price++;
		}

	}


}
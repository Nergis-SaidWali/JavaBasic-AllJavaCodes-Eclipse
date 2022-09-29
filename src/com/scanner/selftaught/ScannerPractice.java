package com.scanner.selftaught;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is you first name?");
		String name=scan.next();
		
		System.out.println("What is your age?");
		int age=scan.nextInt();
		
		System.out.println("What is your senior quote?");
		String quote=scan.next();
		quote += scan.nextLine();
		
		System.out.println("Thank you "+name+", your age is "+age+" years old.");
		System.out.println("and your senior quote is "+quote);
		
	}

}

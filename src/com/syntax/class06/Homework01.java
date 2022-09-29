package com.syntax.class06;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		/*
		 * 1. Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Where are you from?");
		String country=input.nextLine();
		String language;
		
		switch(country) {
		case "Usa":
			language="English";
			break;
		case "Turkey":
			language="Turkish";
			break;
		case "Saudi Arabia":
			language="Arabic";
			break;
		case "India":
			language="Indian";
			break;
		case "Spain":
			language="Spanish";
			break;
		case "Afghanistan":
			language="Dari Persion";
			break;
		default:
			language="Unknown";
				break;			
		}
		System.out.println("You are from "+country+" and your language is "+language);
	}

}

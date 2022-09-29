package com.syntax.class06;

import java.util.Scanner;

public class TaskGrade {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your quiz score");
		double quiz=input.nextDouble();
		
		System.out.println("Please enter your mid term score");
		double midTerm=input.nextDouble();
		
		System.out.println("Please enter your final score");
		double finalScore=input.nextDouble();
		double average;
		average=(quiz+midTerm+finalScore)/3;
		
		String grade="null";
		
		if(average>=90) {
			grade="A";
		}else if(average>=70 && average<90) {
			grade="B";
		}else if (average>=50 && average<70) {
			grade="C";
		}else if(average<50 && average>0) {
			grade="F";
		}else {
			System.out.println("Wrong info is entered");
			grade="None";
		}
		System.out.println("Grade: "+grade);
		
		
		
		

	}

}

package com.syntax.class03;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * Type casting => converting one data type to another data type
		 * Why should I learn about type casting?
		 * so that we can use the code that is written by someone else to make our life easier
		 * or when we will be working in teams we will be able to merge the code
		 * What is the syntax for casting?
		 * ()
		 * when we are converting something smaller to larger we don't need to do anything
		 * it happens automatically we just assign variable for example
		 * 
		 * 
		 * 
		 * int box=1234;
		 * 
		 * long box2=box; // this is how it works and it is called implicit or widening automatically
		 * 
		 * however, when we convert a larger data type to a smaller type then this is how we do it
		 * 
		 * long box=1245454;
		 * 
		 * int box2=(int) box; narrowing or explicit or manual
		 */
		byte box1=127; // smallest box
		short box2=3333;//slightly large box
		int box3=45454545; //large box most commonly used
		long box4=454454554; //slightly large box
		float box5=454454545.4555f; //larger box
		double box6=45454.455; // largest box
				
				
		int number=(int) 15.2; //we can't store the decimal number in a box of type int
		System.out.println(number);
		
		byte smallerBox=(byte) box2;
		System.out.println(smallerBox);
		
		short biggerBox=(short) box1;
		System.out.println(biggerBox);
		
		long box7=box1; //we csn do this because box7 is larger than box1
		
		float box9=box1;
		System.out.println(box9); //system converts automatically
		
		char a=(char) 68;
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
	}

}

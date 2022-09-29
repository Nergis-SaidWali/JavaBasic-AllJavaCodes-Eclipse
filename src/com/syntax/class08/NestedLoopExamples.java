package com.syntax.class08;

public class NestedLoopExamples {

	public static void main(String[] args) {
		
		//car example
		
		for(int a=0; a<=9; a++) {
			
			for(int b=0; b<=9; b++) {
				
				for(int c=0; c<=9; c++) {
					
					System.out.println(a+" "+b+" "+c+" ");
				}
			}
			
			// multiplication table
			
			for(int x=1; x<=9; x++) {
				
				for(int y=1; y<=9; y++) {
					System.out.println(x+" x "+y+" = "+x*y);
				}
				System.out.println("----------------------------------");
			}
			
			
			
		}

	}

}

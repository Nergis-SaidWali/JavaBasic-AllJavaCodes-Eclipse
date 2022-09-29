package com.syntax.class08;

public class Task01 {

	public static void main(String[] args) {
		// from the range of 1 to 50 please find the sum of all even and all odd numbers
		int oddsum=0;
		int evensum=0;
		
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
				evensum=i+evensum;
			}else if(i%2!=0) {
				oddsum=i+oddsum;
			}
			}
		System.out.println(evensum);
		System.out.println(oddsum);
		
		
		
		
		
		
		

	}

}

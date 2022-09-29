package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			
			if(i==3) {
			continue;
			}
			System.out.println("Hello");
			
		}
		
		//I want to print numbers from 1-20 except number 6,7,8
		
		for(int x=1; x<=20; x++) {
			if(x==6 || x==7 || x==8) {
				continue;
			}
			System.out.print(x+" ");
		}
	//continue - continues to the next iteration/cycle. Moment java sees continue -> it goes back to the beginning of the loop
		//it usually used inside some type of conditions
	}
	}



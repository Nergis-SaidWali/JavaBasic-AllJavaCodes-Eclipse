package com.syntax.class13;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String str="Today is Sunday";
		String day=str.substring(9); //9 is a single argument
		System.out.println(day);
		System.out.println(str.substring(6,8));
		System.out.println(str.charAt(6)); 
		
		
		char c=str.charAt(4);// calling the method charAt on str object
		System.out.println(c);
		
		char[] charArr=str.toCharArray();  //change the string to an array / array of characters
		System.out.println(charArr);
		System.out.println(Arrays.toString(charArr));
		
		int index=str.indexOf("a");
		System.out.println(index);
		System.out.println(str.indexOf("a",6));//to find another utterance
		
		String food= "Baklava";
        for(int i=food.length()-1; i>=0; i--) {
            System.out.print(food.charAt(i));
		
        }
	}

}

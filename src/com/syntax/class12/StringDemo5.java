package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String str="I love java programming";
		
		for(int i=0; i<str.length(); i++) {
			//print only the characters not spaces
			if((str.charAt(i)!=' ')) {
			System.out.println(str.charAt(i));
		}

	}

}
}

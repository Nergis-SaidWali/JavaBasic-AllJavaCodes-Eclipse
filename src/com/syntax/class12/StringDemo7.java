package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		
		String str="I am always confused";
		
		//This method is used just for the first utterance
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		
		
		System.out.println("-----------------------------------------------------");
		/*
		 * substring() gives you smaller string from a String, we can start the starting part to this part
		 * to this method and it will return us the subStringfrom that index
		 */
		
		System.out.println(str.substring(5));
		
		System.out.println(str.substring(5,11));
		
		System.out.println("---------------------------------------------------------");
		int num=121232323;
		String numStr=String.valueOf(num).substring(1,3);
		System.out.println(numStr);
		
		

	}

}

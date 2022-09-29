package com.syntax.class12;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 */
		
		String str="Sunday"; 
		String rvrs="";
		char ch;
        
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        rvrs= ch+rvrs; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ rvrs);
			
      	System.out.println("------------------------------------------------");
      	
      	String str1="Monday";
      	for(int i=str.length()-1; i>=0; i--) {
      		System.out.print(str.charAt(i));
      	}
      	
      	System.out.println("--------------------------------------------------");
      	
      	char [] charArr=str.toCharArray();
      	for(int i=charArr.length-1; i>=0; i--) {
      		System.out.print(charArr[i]);
      	}
	}

}

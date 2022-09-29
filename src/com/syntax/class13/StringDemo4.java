package com.syntax.class13;

import java.util.Arrays;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String str="Batch 14 is really good";
		
		String[] arr=str.split(" "); // space is not a regular expression / we can use /s instead of space
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]);
		
		String str2="Today is Sunday. Sunday is good. Java is also good.";
		String[] arr2=str2.split("[.]"); // period is a regular expression so we use square brackets
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[1]);
		
		
		

	}

}

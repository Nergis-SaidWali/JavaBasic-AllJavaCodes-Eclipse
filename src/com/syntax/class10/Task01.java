package com.syntax.class10;

public class Task01 {
	public static void main(String[] args) {
		
		/*
		 * Create a 2D array (longer way)where you will store the following values: 
		 * Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
			After storing values print following String:
			Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		 */
		
		String[][] arr=new String[2][4];
		arr[0][0]="Mr";
		arr[0][1]="Mrs";
		arr[0][2]="Ms";
		arr[0][3]="Miss";
		
		arr[1][0]="Smith";
		arr[1][1]="Jordan";
		arr[1][2]="Jackson";
		arr[1][3]="Obama";
		
		System.out.println(arr[0][1]+" "+arr[1][0]);
		System.out.println(arr[0][0]+" "+arr[1][3]);
		System.out.println(arr[0][2]+" "+arr[1][2]);
		System.out.println(arr[0][3]+" "+arr[1][1]);
		
		
	}

}

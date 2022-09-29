package com.syntax.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//storing and representing whole number values;
		byte box1 = 20;
		short box2 =100;
		int box3=100000; //popular
		long box4=10000000000L;//credit cards, transaction
		
		
		box1 = 30;
		box2 = 200;
		box3 = 2000000;
		box4=200000000000L;
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		
		//storing and representing decimal values;
		float variable1=1.99f;
		double variable2=99.99;//popular
		
		
		variable1=2.98f;
		variable2=9999.99;
		
		System.out.println(variable1);
		System.out.println(variable2);
		
		//storing single characters
		char container1='A';
		char dollar='$';
		
		
		container1='F';
		dollar='D';
		
		System.out.println(container1);
		System.out.println(dollar);
		
		//storing yes or no values
		boolean hot=true;
		boolean tired=false;
		System.out.println(hot);
		System.out.println(tired);
		
		hot=false;
		tired=true;
		
		System.out.println(hot);
		System.out.println(tired);
		
		
		
	}

}
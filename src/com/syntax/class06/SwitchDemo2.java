package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		//matching cases must be the same data type as a variable
		// no duplicate cases in switch 
		char choice='K';
		String answer;
		
		switch(choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}
		System.out.println(answer);
		
		//limitations of SWITCH CASE
		/*
		 * switch case cannot use logical operators
		 * switch case cannot use relational operators
		 * 
		 * 
		 * Cannot work with boolean values
		 * CE: Cannot switch on a value of type boolean
		 * boolean boo=true;
		 */
		
		/*
		 * CANNOT work with float/double and long
		 * 
		 * 
		 * can work byte/short/int/char/String
		 */

	}

}

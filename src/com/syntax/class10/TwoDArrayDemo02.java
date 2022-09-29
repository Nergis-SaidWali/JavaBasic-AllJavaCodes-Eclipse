package com.syntax.class10;

public class TwoDArrayDemo02 {

	public static void main(String[] args) {
		
		
		String[][] countries= {
				{"Usa", "Canada"}, //1st array with index 0
				{"Peru", "Brazil", "Colombia", "Ecuador"}, //2nd array with index 1
				{"Ethiopia", "Egypt", "Kenya"},//3rd array with index 2
				{"Germany", "Turkiye", "Moldova", "Ukraine"},//4th array with index 3
				{"Kazakhstan", "Afghanistan", "Korea"} 
		};
		System.out.println(countries.length); //5- total number of arrays or rows
		int elof1arr=countries[0].length;
		System.out.println("# of elements from 1 array = "+elof1arr);
		
		int elof2arr=countries[1].length;
		System.out.println("# of elements from 2 array = "+elof2arr);
		
		System.out.println("-------------------------getting all values from 2d array---------------------------------");
		
		for(int r=0; r<countries.length; r++) { //loops over rows
			for(int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("--------------------------------------------------------------------------------------");
		
		for(String[] country:countries) {
			for(String c:country) {
				System.out.print(c+" ");
			}
			System.out.println(" ");
		}
		


	}

}

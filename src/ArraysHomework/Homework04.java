package ArraysHomework;

public class Homework04 {

	public static void main(String[] args) {
		
		//From an array of integer elements find the largest number.
		
		int largestnum = 0;
		int[] numbers= {7,19,4,26,37,12,79};
		
		for(int i=0; i<numbers.length; i++) {
			if(largestnum<numbers[i]) {
				largestnum=numbers[i];
			}
		
		}
		System.out.println("The largest number is "+largestnum);
		
		
		
	}

}

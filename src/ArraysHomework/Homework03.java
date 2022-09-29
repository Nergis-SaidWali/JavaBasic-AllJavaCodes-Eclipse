package ArraysHomework;

public class Homework03 {

	public static void main(String[] args) {
	
		//Create an array on integers and calculate the sum of all elements in an array
		
		int[] numbers= {5,29,46,93,135};
		
		System.out.println(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);
		
		
		System.out.println("-----------------------------------------");
		int sum = 0;
		
		for(int i=0; i<numbers.length; i++) {
			sum+=numbers[i];
			
		}
		System.out.println("The sum is "+sum);
	}

}

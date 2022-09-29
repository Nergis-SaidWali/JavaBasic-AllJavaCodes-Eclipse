package ArraysHomework;

public class Homework02 {

	public static void main(String[] args) {
		
		//Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
		
		String[] animals= {"panda", "monkey", "elephant", "giraffe", "crocodile"};
		
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		System.out.println("----------------------------------------------------------------");
		
		for(String anim:animals) {
			System.out.print(anim+" ");
		}
		System.out.println(" ");
	}

}

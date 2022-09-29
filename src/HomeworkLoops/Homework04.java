package HomeworkLoops;

public class Homework04 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		
		int i=21;
		
		while(i<=50) {
			System.out.print(i+" ");
			i+=2;
		}
		
		System.out.println("---------------------------------------------------------------");
		
		int a=20;
		
		while(a<=50) {
			if(a%2==1) {
			System.out.print(a+" ");
		}
		a++; }
	}

}

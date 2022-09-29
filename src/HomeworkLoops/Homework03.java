package HomeworkLoops;

public class Homework03 {

	public static void main(String[] args) {
		//Print even numbers from 20 to 1 (2 ways)
		
		int i=20;
		
		while(i>=1) {
			System.out.print(i+" ");
			i-=2;
		}
		
		System.out.println("------------------------------------------------------------");
		
		int a=20;
		
		while(a>=1) {
			if(a%2==0) {
			System.out.print(a+" ");
			}
			a--;
		}
		
		System.out.println("-------------------------------------------------------------------");
		for(int b=20 ; b>=1 ; b-=2) {
            System.out.print(b+" ");
        }
	}

}

package reviewClass03;

public class LogicalOperator3 {

	public static void main(String[] args) {
		
		
		double savings=200000;
		boolean freeTime=true;
		String season="Summer";
		
		if(savings>100000 && freeTime && season.equalsIgnoreCase("summer")) {
			System.out.println("Let's go to Bora Bora");
		}else {
			System.out.println("I need time and money");
		}

	}

}

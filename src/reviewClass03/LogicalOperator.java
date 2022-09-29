package reviewClass03;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		boolean programmer=false;
		boolean manualTester=true;
		boolean knowFramework=false;
		
		if(programmer&&manualTester&&knowFramework) {
			System.out.println("");
		}else {
			System.out.println("You must know a programming language and manual testing "
					+"to be an automation engineer");
		}

	}

}

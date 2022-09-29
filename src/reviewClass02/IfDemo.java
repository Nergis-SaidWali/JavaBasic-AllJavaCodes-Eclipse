package reviewClass02;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String userName="Admin";
	        String password="password";
	       /*
	        * When we have to check if a box contains a value or not
	        * we can use == or.equals()
	        * when the data types are primitive we use == like char int short etc.
	        * when the data types are non-primitive like String we use .equals()
	        */
	        
	        
	        
	        
	        if(password.equals("password123"))
	        {
	            System.out.println("Welcome "+userName);
	        }
	        else
	        {
	            System.out.println("Wrong password "+userName);
	        }

	    }
	}



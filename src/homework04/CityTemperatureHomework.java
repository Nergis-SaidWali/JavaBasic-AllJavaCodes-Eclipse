package homework04;

import java.util.Scanner;

public class CityTemperatureHomework {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Where do you live?");
		String city=scan.next();
		System.out.println("What is the temperature of your city in Fahrenheit?");
		Double Temperature=scan.nextDouble();
		int celcius=(int)((Temperature-32)/1.80);

		System.out.println("The temperature "+Temperature+" of the "+city+" is "+celcius+" degree in Celcius.");
		
		
		

	}

}

package exercise1;

import java.util.Scanner;
public class FahrenheiToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a degree inFahrenheit: ");
			double fahrenheit = input.nextDouble();
			
			double celsius = (5.0/9) * (fahrenheit - 32);
			System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");


	}

}

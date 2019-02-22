package org.chapter02.listing;

import java.util.Scanner;

public class L02$06_FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		//Convert Fahrenheit to Celsius
		double celsius = (5.0/9)*(fahrenheit-32);
		System.out.println("Fahrenheit "+fahrenheit+" is "+celsius+" in Celsius");
	}

}

package org.chapter02.listing;

import java.util.Scanner;

public class L02$02_ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a radius
		System.out.println("Enter a number for radius:");
		double radius = input.nextDouble();
		
	    //Compute area
		double area = radius * radius * 3.14159;
		
		//Display results
		System.out.println("The area for the circle of radius "+radius+" is "+area);

	}

}

package org.chapter03.practice;

import java.util.Scanner;

public class P03$06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter weight in pounds
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble();
		
		//Prompt the user to enter foot and inch
		System.out.println("Enter feet:");
		int numOfFoot = input.nextInt();
		System.out.println("Enter inches:");
		int numOfInch = input.nextInt();
		
		double height = numOfFoot * 12 + numOfInch ;
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		//Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / ( heightInMeters *heightInMeters );
		
		//display the result
		System.out.println("The BMI is :"+bmi);
		if(bmi <18.5){
			System.out.println("Under weight");
		}else if(bmi <25){
			System.out.println("Normal");
		}else if(bmi <30){
			System.out.println("Over weight");
	    }else{
	    	System.out.println("Obese");
	    }
	}
}

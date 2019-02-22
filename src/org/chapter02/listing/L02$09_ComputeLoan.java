package org.chapter02.listing;

import java.util.Scanner;

public class L02$09_ComputeLoan {

	public static void main(String[] args) {
		//Create a Scaner
		Scanner input = new Scanner(System.in);
		
		//Enter annual interest rate in percentage,e.g.,7.25%
		System.out.print("Enter annual interest rate in percentage,e.g.,7.25%:");
		double annualInterestRate = input.nextDouble();
		
		//Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		//Enter a number of year;
		System.out.print("Enter number of years as an integer,e.g.,5:");
		int numberOfYears = input.nextInt();
		
		//Enter loan amount
		System.out.print("Enter loan amount , e.g., 120000.95:");
		double loanAmount = input.nextDouble();
		
		//Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate /
				(1-1/Math.pow(monthlyInterestRate+1, numberOfYears*12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.println("The monthly payment is $"+(int)(monthlyPayment*100)/100.0);
		System.out.println("The total payment is $"+(int)(totalPayment*100)/100.0);
	}
}

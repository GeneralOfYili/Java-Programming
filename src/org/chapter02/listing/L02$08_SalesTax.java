package org.chapter02.listing;

import java.util.Scanner;

public class L02$08_SalesTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $"+(int)(tax * 100)/100.0);
	}
}

package org.chapter02.practice;

import java.util.Scanner;

public class P02$21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		double amount = input.nextDouble();
		
		System.out.println("Enter interest rate in percentage: ");
		double rate = input.nextDouble();
		
		System.out.println("Enter number of years: ");
		double year = input.nextDouble();
		
		double result = amount * Math.pow(1+rate/100.0, year * 12);
	
		System.out.println("result:"+result);
	}
}

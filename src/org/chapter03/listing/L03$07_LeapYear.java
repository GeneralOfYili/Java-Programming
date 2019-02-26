package org.chapter03.listing;

import java.util.Scanner;

public class L03$07_LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an year: ");
		int year = input.nextInt();
		
		//Check if the year if a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
		System.out.println(year + " is a leap year? "+isLeapYear);
	}
}

package org.chapter03.listing;

import java.util.Scanner;

public class L03$06_TestBooleanOperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		if( number % 2 == 0 && number % 3 == 0){
			System.out.println(number + " is divisivle by 2 and 3");
		}
		if( number % 2 == 0 || number % 3 == 0){
			System.out.println(number + " is divisivle by 2 or 3");
		}
		if( number % 2 == 0 ^ number % 3 == 0){
			System.out.println(number + " is divisivle by 2 or 3,but not both");
		}
	}
}

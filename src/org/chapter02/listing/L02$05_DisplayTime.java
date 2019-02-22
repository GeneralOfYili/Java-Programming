package org.chapter02.listing;

import java.util.Scanner;

public class L02$05_DisplayTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.println("Enter a integer for seconds: ");
		int seconds = input.nextInt();
		
	    //Find minutes in seconds
		int minutes = (seconds / 60);
		//Seconds remaining
		int remainingSeconds =(seconds % 60);
		
		//Display results
		System.out.println(seconds + " seconds is "+minutes+
				" minutes and " + remainingSeconds + " seconds");
	}

}

package org.chapter02.practice;

import java.util.Scanner;

public class P02$08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the minutes:");
		int in = input.nextInt();
		//Obstain the total milliseconds since midnight,Jan 1,1970;
		long totalMilliseconds = System.currentTimeMillis() + in * 60*60;
		
		//Obstain the total seconds since midnight,Jan 1,1970;
		long totalSeconds = totalMilliseconds / 1000;
		
		//Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60 ;
		
		//Obtain the total hour
		long totalHours = totalMinutes / 60;
		
		//Compute the current hour
		long currentHour = totalHours % 24;
		
		//The time difference between Beijing and London is 8 hours
		System.out.println("Current time is: "+(currentHour+8)+":"+currentMinute+":"+currentSecond);
	}
}

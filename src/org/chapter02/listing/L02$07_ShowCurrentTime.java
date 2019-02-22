package org.chapter02.listing;

public class L02$07_ShowCurrentTime {

	public static void main(String[] args) {
		//Obstain the total milliseconds since midnight,Jan 1,1970;
		long totalMilliseconds = System.currentTimeMillis();
		
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

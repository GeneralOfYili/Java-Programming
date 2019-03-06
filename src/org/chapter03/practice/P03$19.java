package org.chapter03.practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03$19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt user enter the year
		System.out.println("Enter the year:");
		String yearInString = input.nextLine();
		
		int year = 0;
		if(valid(yearInString)){
			year = Integer.parseInt(yearInString);
		}else{
			System.out.println("yeal illegal");
			P03$19.main(args);
		}
		
		//Prompt user enter the month
		System.out.println("Enter the month:");
		String monthInString = input.nextLine();
		
		int month = 0;
		if(valid(monthInString) && Integer.parseInt(monthInString) >= 1 && Integer.parseInt(monthInString) <= 12  ){
			month = Integer.parseInt(monthInString);
		}else{
			System.out.println("month illegal");
			P03$19.main(args);
		}
		
		//Prompt user enter the month
		System.out.println("Enter the day of month:");
		String daysInString = input.nextLine();
		
		int days = 0;
		if(valid(daysInString) && Integer.parseInt(daysInString) >= 1 && Integer.parseInt(daysInString) <= 31){
			days = Integer.parseInt(daysInString);
		}else{
			System.out.println("days illegal");
			P03$19.main(args);
		}
		//initialize map of a week
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "Saturday");
		map.put(1, "Sunday");
		map.put(2, "Monday");
		map.put(3, "Tuesday");
		map.put(4, "Wednesday");
		map.put(5, "Thursday");
		map.put(6, "Friday");
		
		int q = days;
		int m  ;
		if( month >=3 && month <= 12){
			m = month;
		}else{
			m = month + 12;
		}
		int j = year / 100;
	    int k = year % 100;
	    int h = (q +26*(m+1)/10 + k + k/4 +j/4 +5*j)%7;
		System.out.println("Day of week is "+map.get(h));
	}	
	private static boolean valid(String input) {
		Pattern pattern = Pattern.compile("[1-9]\\d*"); 
	    Matcher isNum = pattern.matcher(input);
	    if(isNum.matches())
	    	return true;
	    else{
	    	return false;
	    }
	}
}

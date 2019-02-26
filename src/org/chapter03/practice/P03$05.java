package org.chapter03.practice;

import java.util.Scanner;

public class P03$05 {

	public static void main(String[] args) {
		System.out.println("Enter today's day:(0~6)");
		Scanner input = new Scanner(System.in);
		int dayOfToday = input.nextInt();
		showDay(dayOfToday);
		
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsedDays = input.nextInt();
		int finalDay = dayOfToday + elapsedDays ;
		showDay(finalDay%7);
	}

	private static void showDay(int day) {
		switch (day) {
			case 0:System.out.println("Sunday");break;
			case 1:System.out.println("Monday");break;
			case 2:System.out.println("Tuesday");break;
			case 3:System.out.println("Wednesday");break;
			case 4:System.out.println("Thursday");break;
			case 5:System.out.println("Friday");break;
			case 6:System.out.println("Saturday");break;
		}
	}
}

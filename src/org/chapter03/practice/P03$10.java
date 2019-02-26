package org.chapter03.practice;

import java.util.Scanner;

public class P03$10 {

	public static void main(String[] args) {
		
		//Prompt the user to enter a year
		System.out.println("Enter a year in 4 digits:");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
		
		System.out.println("Enter a month less than or equal 12 :");
		int month = input.nextInt();
		
		if(isLeapYear){
			switch (month) {
				case 1:System.out.println("31 days");break;
				case 2:System.out.println("29 days");break;
				case 3:System.out.println("31 days");break;
				case 4:System.out.println("30 days");break;
				case 5:System.out.println("31 days");break;
				case 6:System.out.println("30 days");break;
				case 7:System.out.println("31 days");break;
				case 8:System.out.println("31 days");break;
				case 9:System.out.println("30 days");break;
				case 10:System.out.println("31 days");break;
				case 11:System.out.println("30 days");break;
				case 12:System.out.println("31 days");break;
			}
		}else{
			switch (month) {
				case 1:System.out.println("31 days");break;
				case 2:System.out.println("28 days");break;
				case 3:System.out.println("31 days");break;
				case 4:System.out.println("30 days");break;
				case 5:System.out.println("31 days");break;
				case 6:System.out.println("30 days");break;
				case 7:System.out.println("31 days");break;
				case 8:System.out.println("31 days");break;
				case 9:System.out.println("30 days");break;
				case 10:System.out.println("31 days");break;
				case 11:System.out.println("30 days");break;
				case 12:System.out.println("31 days");break;
			}
		}
	}

}

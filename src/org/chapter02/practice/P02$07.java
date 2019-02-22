package org.chapter02.practice;

import java.util.Scanner;

public class P02$07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the minutes:");
		int in = input.nextInt();
		int totalDay = in / 60 /24 ;
		int year = totalDay / 365 ;
		int day = totalDay % 365 ;
		System.out.println("year:"+year);
		System.out.println("day:"+day);
	}
}

package org.chapter02.practice;

import java.util.Scanner;

public class P02$12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years:");
		int year = input.nextInt();
		int burn = year * 365 * 24 * 60 * 60 / 7;
		int death = year * 365 * 24 * 60 * 60 / 13;
		int immigrant = year * 365 * 24 * 60 * 60 / 45;
		System.out.println("population:"+(312032486+burn+immigrant-death));
	}
}

package org.chapter02.practice;

import java.util.Scanner;

public class P02$03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the pounds: ");
		double pounds = input.nextDouble();
		double kilogram = pounds * 0.454;
		System.out.println("pounds:"+pounds);
		System.out.println("kilogram:"+kilogram);
	}
}

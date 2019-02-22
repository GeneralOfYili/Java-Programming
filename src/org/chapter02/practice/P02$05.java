package org.chapter02.practice;

import java.util.Scanner;

public class P02$05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and rate:");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble() / 100;
		double gratuity = subtotal * rate;
		double total = subtotal + gratuity;
		System.out.println("gratuity:"+gratuity);
		System.out.println("total:"+total);
	}
}

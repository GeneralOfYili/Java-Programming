package org.chapter02.practice;

import java.util.Scanner;

public class P02$17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature:");
		double t = input.nextDouble();
		
		System.out.println("Enter the wind speed:");
		double v = input.nextDouble();
		
		double result = 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
		System.out.println("result:"+result);
	}
}

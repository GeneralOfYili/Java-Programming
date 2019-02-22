package org.chapter02.practice;

import java.util.Scanner;

public class P02$10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of water in kilograms:");
		double mess = input.nextDouble();
		System.out.println("Enter the initial temperature:");
		double initialTemperature = input.nextDouble();
		System.out.println("Enter the final temperature:");
		double finalTemperature = input.nextDouble();
		
		double energy = mess * (4184) *(finalTemperature-initialTemperature);
		
		System.out.println("energy:"+energy);
	}
}

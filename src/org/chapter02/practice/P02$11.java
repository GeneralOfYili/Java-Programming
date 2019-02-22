package org.chapter02.practice;

import java.util.Scanner;

public class P02$11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the speed and acceleration:");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		double length = speed * speed / (2* acceleration);
		System.out.println("length:"+length);
	}
}

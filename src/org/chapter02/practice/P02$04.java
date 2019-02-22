package org.chapter02.practice;

import java.util.Scanner;

public class P02$04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the feet: ");
		double feet = input.nextDouble();
		double meter = feet * 0.305;
		System.out.println("feet:"+feet);
		System.out.println("meter:"+meter);
	}
}

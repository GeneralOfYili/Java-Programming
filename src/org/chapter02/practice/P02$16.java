package org.chapter02.practice;

import java.util.Scanner;

public class P02$16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side:");
		double side = input.nextDouble();
		double area = 3.0/2*Math.pow(3, 0.5) *side*side ;
		System.out.println("area"+area);
	}
}

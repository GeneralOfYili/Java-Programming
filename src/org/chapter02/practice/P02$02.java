package org.chapter02.practice;

import java.util.Scanner;

public class P02$02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("radius and length: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = radius * radius * Math.PI;
		double volume = area * length ;
		System.out.println("area:"+area);
		System.out.println("volume:"+volume);
	}
}

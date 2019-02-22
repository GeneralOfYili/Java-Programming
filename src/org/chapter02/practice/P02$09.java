package org.chapter02.practice;

import java.util.Scanner;

public class P02$09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter v0 , v1 ,t:");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		double a = (v1-v0)/t;
		System.out.println("a:"+a);
	}
}

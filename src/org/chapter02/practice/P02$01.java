package org.chapter02.practice;

import java.util.Scanner;

public class P02$01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius: ");
		int in = input.nextInt();
		double out = (9.0/5)*in +32;
		System.out.println(out);
	}
}

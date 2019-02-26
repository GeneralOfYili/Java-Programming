package org.chapter03.practice;

import java.util.Scanner;

public class P03$03 {

	public static void main(String[] args) {
		
		System.out.println("The meaning is show as fellow");
		System.out.println("ax + by = e");
		System.out.println("cx + dy = f");
		System.out.println("Enter a,b,c,d,e,f : ");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		System.out.println("x is "+getX(a,b,c,d,e,f));
		System.out.println("y is "+getY(a,b,c,d,e,f));
	}

	private static double getY(double a, double b, double c, double d, double e, double f) {
		return (a * f - e * c)*1.0/(a * d - b * c);
	}

	private static double getX(double a, double b, double c, double d, double e, double f) {
		return (e * d - b * f)*1.0/(a * d - b * c);
	}
}

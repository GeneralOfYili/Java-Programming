package org.chapter03.practice;

import java.util.Scanner;

public class P03$01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if( b*b - 4*a*c > 0){
			System.out.println("The equation has two roots: "+getFirstRoot(a,b,c)+"and"+getSecondRoot(a,b,c));
		}else if(b*b - 4*a*c == 0){
			System.out.println("The equation has one root: "+getFirstRoot(a,b,c));
		}else{
			System.out.println("The equation has no real roots");
		}
	
	}


	private static double getFirstRoot(double a, double b, double c) {
		return (-b + Math.pow(b*b - 4*a*c , 0.5))/(2*a);
	}
	private static double getSecondRoot(double a, double b, double c) {
		return (-b - Math.pow(b*b - 4*a*c , 0.5))/(2*a);
	}
}

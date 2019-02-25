package org.chapter02.practice;

import java.util.Scanner;

public class P02$20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("balance and interest rate: ");
		double balance = input.nextDouble();
		double rate = input.nextDouble();
		double result = balance * rate / 1200 ;
		System.out.println("result:"+result);
	}
}

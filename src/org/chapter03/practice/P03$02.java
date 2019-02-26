package org.chapter03.practice;

import java.util.Scanner;

public class P03$02 {

	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 7 % 10);
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is "+number1+" + "+number2 +" + "+number3+"?");
		 
		int answer = input.nextInt();
		System.out.println(answer == (number1+number2+number3));
	}
}

package org.chapter03.practice;

import java.util.Scanner;

public class P03$09 {

	public static void main(String[] args) {
		//Generate two random single-digit integers
		int number1 = (int)(Math.random()*100);
		int number2 = (int)(Math.random()*100);
		
		System.out.println("What is "+number1 +" + "+number2+" ?");
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		System.out.println(result == number1 + number2);
	}

}

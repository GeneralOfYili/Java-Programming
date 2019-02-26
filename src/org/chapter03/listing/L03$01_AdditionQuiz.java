package org.chapter03.listing;

import java.util.Scanner;

public class L03$01_AdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is "+number1+" + "+number2 +"?");
		 
		int answer = input.nextInt();
		System.out.println(answer == (number1+number2));
	}

}

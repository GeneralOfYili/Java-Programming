package org.chapter03.listing;

import java.util.Scanner;

public class L03$03_SubtractionQuiz {

	public static void main(String[] args) {
		//Generate two random single-digit integers
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		
		//if number1 < number2 ,swap them
		if(number1 < number2){
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		System.out.println("What is "+number1 +" - "+number2+" ?");
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		System.out.println(result == number1 - number2);
	}

}

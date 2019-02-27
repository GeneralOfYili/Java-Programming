package org.chapter03.practice;

import java.util.Scanner;

public class P03$12 {

	public static void main(String[] args) {
		
		//Prompt the user to enter a number
		System.out.println("Enter a integer of 0 or 1 "
				+ "to represent head or tail of a coin:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		switch (number) {
		case 0:System.out.println("you choose head of a coin" + getResult());break;
		case 1:System.out.println("you choose tail of a coin" + getResult());break;
		default:System.out.println("you tab uncorrect character");break;
		}
	}

	private static String getResult() {
		int random =(int)( Math.random() * 10);
		if(random % 2 == 0 ){
			return " got it !!!";
		}else return " sorry to miss";
	}
}

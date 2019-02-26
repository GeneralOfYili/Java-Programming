package org.chapter03.listing;

import java.util.Scanner;

public class L03$02_SimpleIfDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number = input.nextInt();
		if(number % 5 ==0){
			System.out.println("HiFive");
		}
		if(number % 2 ==0){
			System.out.println("HiEven");
		}
	}

}

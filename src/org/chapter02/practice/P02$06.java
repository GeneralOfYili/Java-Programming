package org.chapter02.practice;

import java.util.Scanner;

public class P02$06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integer:");
		int in = input.nextInt();
		int sum = 0 ;
		while(in>0){
			sum += in%10;
			in /= 10;
		}
		System.out.println("sum:"+sum);
	}
}

package org.chapter03.practice;

import java.util.Scanner;

public class P03$11 {

	public static void main(String[] args) {
		
		//Prompt the user to enter a number
		System.out.println("Enter a integer in 3 digits:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number < 100 || number > 999){
			System.out.println("数字长度不合法,请输入三位数字");
			
		}
		
		int hundred = number / 100;
		int unit = number % 10 ;
		if(hundred == unit){
			System.out.println(number+" is a palindrome");
		}else{
			System.out.println(number+" is not a palindrome");
		}
	}

}

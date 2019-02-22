package org.chapter02.practice;

import java.util.Scanner;

public class P02$13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of month'money:");
		double money = input.nextDouble();
		System.out.println("Enter the number of month:");
		int month = input.nextInt();
		
		double totalMoney = getTotalMoney(money,month);
		System.out.println("totalMoney:"+totalMoney);
	}

	private static double getTotalMoney(double money, int month) {
		if(month == 0){
			return 0;
		}else if(month == 1){
			return (1+0.00417)*money;
		}else{
			return (100+getTotalMoney(money,month-1))*(1+0.00417);
		}
	}
}

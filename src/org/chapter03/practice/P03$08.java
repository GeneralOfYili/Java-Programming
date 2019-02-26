package org.chapter03.practice;

import java.util.Scanner;

public class P03$08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("e.g. 012345678");
		System.out.println("Enter first 9 digits of an ISBN as integer");
		String front = input.nextLine();
		
		//校验长度
		if(front.length() != 9){
			System.out.println("长度不合法!");
			System.exit(1);
		}
		
		char[] charArray = front.toCharArray();
		int[] intArray = new int[9];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(""+charArray[i]);
		}
		
		String checksum = (getSum(intArray) == 10)?"X":(""+getSum(intArray));
		
		System.out.println(front+checksum);
	}

	private static int getSum(int[] intArray) {
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += ((i+1)*intArray[i]);
		}
		return sum%11;
	}
}

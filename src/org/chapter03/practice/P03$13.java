package org.chapter03.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class P03$13 {

	public static void main(String[] args) {
		
		//Prompt user to enter a three digits number;
		System.out.println("Enter a three digits number(e.g. 012 , 234 ,,,):");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		//verify input
		if(verify(input)){
			//initialize inputArray and LotteryList
			char[] charArray = input.toCharArray();
			int[] inputArray = new int[input.length()];
			ArrayList<Integer> LotteryList = new ArrayList<>();
			for (int i = 0; i < input.length(); i++) {
				inputArray[i] = Integer.parseInt(""+charArray[i]);
				LotteryList.add((int)(Math.random() * 10));
			}
			//display the result
			System.out.print("input: ");
			for (int i = 0; i < inputArray.length; i++) {
				System.out.print(inputArray[i]+" ");
			}
			System.out.println();
			System.out.println("lottery result"+LotteryList);
			//display award
			switch (award(inputArray,LotteryList)) {
				case "First":  System.out.println("equal !!!  $10,000");break;
				case "Second": System.out.println("contain all !!!   $3,000");break;
				case "Third":  System.out.println("contain some !!!   $1,000");break;
				default:       System.out.println("miss award");break;
			}
		}else{
			System.out.println("Please Enter correct input!!!");
			P03$13.main(args);
		}
	}
	private static String award(int[] inputArray, ArrayList<Integer> lotteryList) {
		boolean equal = true;
		boolean contain = false;
		boolean containAll = true;
		//verify equal
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] != lotteryList.get(i)) equal = false;
		}
		//verify contain
		for (int i = 0; i < inputArray.length; i++) {
			if(lotteryList.contains(inputArray[i])) contain = true;
		}
		//verify containAll
		for (int i = 0; i < inputArray.length; i++) {
			if(!lotteryList.contains(inputArray[i])) containAll = false;
		}
		
		if(equal){
			return "First";
		}else if (!equal && containAll){
			return "Second";
		}else if (!equal && !containAll && contain){
			return "Third";
		}else{
			return "MISS";
		}
	}
	//verify method
	private static boolean verify(String input) {
		boolean result = true;
		char[] charArray = input.toCharArray();
		//verify length
		if (input.length() != 3) result = false;
		//verify contains
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] > '9' || charArray[i] <'0'){
				result = false;
			}
		}
		return result;
	}
}

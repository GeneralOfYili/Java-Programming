package org.chapter03.practice;

import java.util.HashMap;
import java.util.Scanner;

/**
 * scissor rock paper
 * @author lenovo
 *
 */
public class P03$15 {

	public static void main(String[] args) {
		//initialize map to store number and toy
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(0, "scissor");
		hashMap.put(1, "rock");
		hashMap.put(2, "paper");
		
		//Prompt user enter 0 or 1 or 2 
		System.out.println("Game begin, please enter 0 , 1 , 2");
		System.out.println("Enter 0 represent scissor");
		System.out.println("Enter 1 represent rock");
		System.out.println("Enter 2 represent paper");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		//verify input
		if(verify(input)){
			int userChoice = Integer.parseInt(input);
			int computerChoice = (int)(Math.random()*3);
			//display the result
			System.out.println("user choice is "+hashMap.get(userChoice));
			System.out.println("computer choice is "+hashMap.get(computerChoice));
			displayResult(computerChoice,userChoice);
			
		}else{
			System.out.println();
			System.out.println("Tab error !!! \nPlease Enter correct input!!!");
			System.out.println();
			P03$15.main(args);
		}
	}
	
	//display the result
	private static void displayResult(int computerChoice, int userChoice) {
		switch (userChoice -computerChoice ) {
			case 0: System.out.println("It is a draw !!!");break;
			case 1: System.out.println("You won !!!");break;
			case -2: System.out.println("You won !!!");break;
			case 2: System.out.println("You lose !!!");break;
			case -1: System.out.println("You lose !!!");break;
			default: System.out.println("Programm error!!!");break;
		}
	}
	
	//verify the input
	private static boolean verify(String userChoice) {
		boolean result = true;
		//verify length
		if (userChoice.length() != 1) result = false;
		//verify contains
		switch (userChoice) {
			case "0": result = true ;break;
			case "1": result = true ;break;
			case "2": result = true ;break;
			default:  result = false;break;
		}
		return result;
	}
}

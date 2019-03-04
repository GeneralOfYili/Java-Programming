package org.chapter03.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * shipping cost
 * @author lenovo
 *
 */
public class P03$16 {

	public static void main(String[] args) {
		//Prompt user tab weight 
		System.out.println("Enter the weight of the package in pounds:(e.g. 1.234)");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		//verify input
		if(verify(input)){
			//declare weight
			double weight = Double.parseDouble(input);
			//display cost
			showCost(weight);
		}else{
			showError();
			//restart program
			P03$16.main(args);
		}
	}
	//error message
	private static void showError() {
		System.out.println();
		System.out.println("Tab error !!!\nPlease Enter correct input!!!");
	}

	//display cost
	private static void showCost(double weight) {
		if( weight > 0 && weight <= 1.0){
			System.out.println("The weight is "+weight+" ; The cost is 3.5 dollars");
		}else if (weight > 1 && weight <= 3.0){
			System.out.println("The weight is "+weight+" ; The cost is 5.5 dollars");
		}else if (weight > 3 && weight <= 10.0){
			System.out.println("The weight is "+weight+" ; The cost is 8.5 dollars");
		}else if (weight > 10 && weight <= 20.0){
			System.out.println("The weight is "+weight+" ; The cost is 10.5 dollars");
		}else{
			System.out.println("The package cannot be shipped");
		}
	}

	//verify the input
	private static boolean verify(String userChoice) {
	    Pattern pattern = Pattern.compile("[1-9]\\d*.\\d*|0.\\d*[1-9]\\d*|[1-9]\\d*"); 
	    Matcher isNum = pattern.matcher(userChoice);
	    if( !isNum.matches() ){
	        return false; 
	    } 
	    return true; 
	}
}

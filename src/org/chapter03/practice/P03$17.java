package org.chapter03.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Compute the perimeter of a triangle
 * @author lenovo
 *
 */
public class P03$17 {

	public static void main(String[] args) {
		//Prompt user tab edge 
		System.out.println("Enter three of edge in inches:(e.g. 1.1 1.23 1.234)");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		//verify input
		if(verifyType(input)){
			//declare the edge array
			String[] inputArray = input.split(" ");
			double[] edgeArray = new double[inputArray.length];
			for (int i = 0; i < inputArray.length; i++) {
				edgeArray[i] = Double.parseDouble(inputArray[i]); 
			}
			//verify in math
			if(verifyMath(edgeArray)){
				System.out.println("The perimeter of a triangle is :"+getPerimeter(edgeArray));
			}else{
				//restart program
				P03$17.main(args);
			}
		}else{
			//restart program
			P03$17.main(args);
		}
	}
	
	//get perimeter------------------------------------------------------------
	private static double getPerimeter(double[] edgeArray) {
		double sum = 0 ;
		for (int i = 0; i < edgeArray.length; i++) {
			sum += edgeArray[i];
		}
		return sum;
	}

	//verify the  type input--------------------------------------------------
	private static boolean verifyType(String input) {
		String[] inputArray = input.split(" ");
		if(inputArray.length!=3){
			System.out.println("A triangle must have three edges !!!");
			return false;
		} 
		
	    Pattern pattern = Pattern.compile("[0-9]*"); 
	    for (int i = 0; i < inputArray.length; i++) {
	    	 Matcher isNum = pattern.matcher(inputArray[i]);
	 	    if( !isNum.matches() ){
	 	    	System.out.println("Please enter numeric type !!!");
	 	        return false; 
	 	    } 
		}
	    return true; 
	}
	
	//verify math------------------------------------------------------------- 
	private static boolean verifyMath(double[] input) {
		
		if(   input[0] < input[1]+input[2] 
		   && input[0] > Math.abs(input[1]-input[2])
		   && input[1] < input[0]+input[2] 
		   && input[1] > Math.abs(input[0]-input[2])
		   && input[2] < input[0]+input[1] 
		   && input[2] > Math.abs(input[0]-input[1])			
		  ){
			return true;
		}else{
			System.out.println("edge is not available !!!");
			return false;
		}
	}
}

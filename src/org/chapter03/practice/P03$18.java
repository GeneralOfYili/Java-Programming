package org.chapter03.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03$18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature:");
		String t = input.nextLine();
		
		System.out.println("Enter the wind speed:");
		String v = input.nextLine();
		
		if(temperatureValid(t) && velocityValid(v)){
			
			double doublet = Double.parseDouble(t);
			double doublev = Double.parseDouble(v);
			
			double result = 35.74 + 0.6215 * doublet - 35.75 * Math.pow(doublev, 0.16) + 0.4275 * doublet * Math.pow(doublev, 0.16);
			System.out.println("result:"+result);
		}
	}
	//valid velocity
	private static boolean velocityValid(String v) {
	    Pattern pattern = Pattern.compile("[1-9]\\d*.\\d*|0.\\d*[1-9]\\d*|[1-9]\\d*"); 
	    Matcher isNum = pattern.matcher(v);
	    if(isNum.matches() && Double.parseDouble(v) >= 2){
	    	return true;
	    }else{
	    	System.out.println("velocity illegal");
	    	return false;
	    }
	}
	//valid temperature
	private static boolean temperatureValid(String t) {
		Pattern pattern = Pattern.compile("[1-9]\\d*.\\d*|0.\\d*[1-9]\\d*|[1-9]\\d*"); 
	    Matcher isNum = pattern.matcher(t);
	    if(isNum.matches() && Double.parseDouble(t) >= -58 && Double.parseDouble(t) <= 41){
	    	return true;
	    }else{
	    	System.out.println("temperature illegal");
	    	return false;
	    }
	}
}

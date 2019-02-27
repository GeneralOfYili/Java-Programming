package org.chapter03.practice;

/**
 * random rectangle
 * @author lenovo
 *
 */
public class P03$14 {

	public static void main(String[] args) {
		double x = (int)((Math.random()*100 - 50 )*100)/100.0;
		double y = (int)((Math.random()*200 - 100 )*100)/100.0;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}

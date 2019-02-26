package org.chapter03.practice;

import java.util.Scanner;
/**
 * sort
 * @author lenovo
 *
 */
public class P03$07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three integer a,b,c:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int[] array = {a,b,c};
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if(array[j]<=array[i]){
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp ;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}

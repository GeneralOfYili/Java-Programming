package org.chapter25.listing;

import java.util.Scanner;

import org.chapter25.base.Tree;

public class L25$12_HuffmanCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
		int[] counts = getCharacterFrequency(text);
		
		System.out.printf("%-15s%-15s%-15s%-15s\n","ASCII Code","Character","Frequency","Code");
		
		Tree tree = getHuffmanTree(counts);
	}
	
	/**Get a huffman tree from the codes*/
	public static Tree getHuffmanTree(int[] counts) {
		// Create a heap to hode trees
		
		return null;
	}

	/**Get the frequency of the characters*/
	public static int[] getCharacterFrequency(String text) {
		int[] counts = new int[256]; // 256ASCII characters
		for (int i = 0; i < text.length(); i++) {
			counts[(int)text.charAt(0)]++;
		}
		return counts;
	}
}

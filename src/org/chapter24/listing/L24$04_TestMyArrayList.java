package org.chapter24.listing;

import org.chapter24.base.MyArrayList;

public class L24$04_TestMyArrayList {

	public static void main(String[] args) {
		//Create a list
		MyArrayList<String> list = new MyArrayList<>();
		
		//Add elements to the list
		list.add("America");
		System.out.println("(1) "+list);
		
		//Add element to the begining of the list
		list.add(1, "Canada");
		System.out.println("(2) "+list);
		
		//Add element to the end of list
		list.add("Russia");
		System.out.println("(3) "+list);
		
		//Add element to the end of list
		list.add("France");
		System.out.println("(4) "+list);
		
		//Add the element to the index of 2
		list.add(2,"Germany");
		System.out.println("(5) "+list);
		
		//Add the element to the index of 5
		list.add(5,"Norway");
		System.out.println("(6) "+list);
		
		//Remove element from list
		list.remove("Canada");
		System.out.println("(7) "+list);
		
		//Remove element from list
		list.remove(2);
		System.out.println("(8) "+list);
		
		//Remove element from list
		list.remove(list.size-1);
		System.out.print("(9) "+list+"\n(10) ");
		
		for (String s : list) {
			System.out.print(s.toUpperCase()+" ");
		}
	}

}

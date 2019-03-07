package org.chapter24.listing;

import org.chapter24.base.MyLinkedList;

public class L24$05_TestMyLinkedList {

	public static void main(String[] args) {
		//Create a list
		 MyLinkedList<String> list = new MyLinkedList<String>();
		
		//Add elements to the list
		list.add("America");
		System.out.println("(1) "+list);
		
		//Add element to the begining of the list
		list.add(0, "Canada");
		System.out.println("(2) "+list);
		
		//Add element to the end of list
		list.add("Russia");
		System.out.println("(3) "+list);
		
		//Add element to the end of list
		list.addLast("France");
		System.out.println("(4) "+list);
		
		//Add the element to the index of 2
		list.add(2,"Germany");
		System.out.println("(5) "+list);
		
		//Add the element to the index of 5
		list.add(5,"Norway");
		System.out.println("(6) "+list);
		
		//Add the element to the index of 0
		list.add(0,"Poland");
		System.out.println("(7) "+list);
		
		//Remove element from list where index = 0
		list.remove(0);
		System.out.println("(8) "+list);
		
		//Remove element from list
		list.remove(2);
		System.out.println("(9) "+list);
		
		//Remove last element
		list.remove(list.size-1);
		System.out.print("(10)"+list+"\n(11)");
		
		for (String s : list) {
			System.out.print(s.toUpperCase()+" ");
		}
	}
}

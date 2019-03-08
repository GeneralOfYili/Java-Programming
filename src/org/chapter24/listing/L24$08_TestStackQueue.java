package org.chapter24.listing;

import org.chapter24.base.GenericQueue;
import org.chapter24.base.GenericStack;

public class L24$08_TestStackQueue {

	public static void main(String[] args) {
		//Create a stack
		GenericStack<String> stack = new GenericStack<>();
		
		//Add element to stack
		stack.push("Tom");
		System.out.println("(1) "+stack);
		
		//Add element to stack
		stack.push("Susan");
		System.out.println("(2) "+stack);
		
		//Add element to stack
		stack.push("Kim");
		stack.push("Michael");
		System.out.println("(3) "+stack);
		
		//Remove element from the stack
		System.out.println("(4) "+stack.pop());
		System.out.println("(5) "+stack.pop());
		System.out.println("(6) "+stack);
		System.out.println("---------------------------------------");
		
		//Create a queue
		GenericQueue<Object> queue = new GenericQueue<>();
		
		//Add element to queue
	    queue.enqueue("Tom");
	    System.out.println("(7) "+queue);
	    
	    //Add element to queue
	    queue.enqueue("Susan");
	    System.out.println("(8) "+queue);
	    
	    //Add element to queue
	    queue.enqueue("Kim");
	    queue.enqueue("Michael");
		System.out.println("(9) "+queue);
		
		//Remove element from the stack
		System.out.println("(10) "+queue.dequeue());
		System.out.println("(11) "+queue.dequeue());
		System.out.println("(12) "+queue);
	}

}

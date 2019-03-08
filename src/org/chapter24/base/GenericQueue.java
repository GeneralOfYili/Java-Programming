package org.chapter24.base;

import java.util.LinkedList;

public class GenericQueue<E> {
	private LinkedList<E> list = new LinkedList<E>();
	
	/**Add an element to this queue*/
	public void enqueue(E e){
		list.addLast(e);
	}
	
	/**Removes an element to this queue*/
	public E dequeue(){
		return list.removeFirst();
	}
	
	public int getSize(){
		return list.size();
	}

	@Override
	public String toString() {
		return "Queue: "+list.toString();
	}
}

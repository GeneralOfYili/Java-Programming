package org.chapter24.base;

import java.util.Iterator;

public class MyLinkedList<E> extends MyAbstractList<E> {
	
	private Node<E> head,tail;

	/**Create a default list*/
	public MyLinkedList() {
		super();
	}
	/**Create a list from an array of objects*/
	public MyLinkedList(E[] objects) {
		super(objects);
	}

	/**Return the head element in the list*/
	public E getFirst(){
		if (size == 0) {
			return null;
		}else return head.element;
	}
	
	/**Return the last element in the list*/
	public E getLast(){
		if (size == 0) {
			return null;
		}else return tail.element;
	}
	/**Add an element to the beginning of the list*/
	public void addFirst(E e){
		Node<E> newNode = new Node<>(e); //Create a new node
		newNode.next = head; //link the new node with the head
		head = newNode; //head points to the new node
		size++;//Increase list size
		
		if (tail == null) {
			tail = head; //New node is the only node in list
		}
	}
	
	/**Add an element to the end of the list*/
	public void addLast(E e){
		Node<E> newNode = new Node<>(e); //Create a new node
		
		if (tail == null) {
			head = tail = newNode;
		}else{
			tail.next = newNode;
			tail = tail.next;
		}
		size ++ ;
	}
	
	@Override
	public void add(int index, E e) {
		if (index == 0) {
			addFirst(e);
		}else if (index >= size) {
			addLast(e);
		}else{
			Node<E> current = head;
			for (int i = 0; i < index - 1 ; i++) {
				current = current.next;
			}
			Node<E> temp = current.next;
			current.next = new Node<E>(e);
			(current.next).next = temp;
			size++;
		}
	}
	
	/** Remove the head node and return the object that is contained in the removed node.*/
	public E removeFirst(){
		if (size == 0) {
			return null;
		}else{
			Node<E> temp = head;
			head = head.next; //Move head to point to next node
			size -- ;
			if( head == null ){
				tail = null; //List becomes empty
			}
			return temp.element; //Return the deleted element
		}
	}
	
	/** Remove the head node and return the object that is contained in the removed node.*/
	public E removeLast(){
		if (size == 0) {
			return null; //Nothing to remove
		}else if(size == 1){ //Only one element is in the list
			Node<E> temp = head;
			head = tail = null;
			size = 0 ;
			return temp.element;
		}else{
			Node<E> current = head;
			for (int i = 0; i < size - 2; i++) {
				current = current.next;
			}
			Node<E> temp = tail;
			tail = current;
			tail.next = null;
			size-- ;
			return temp.element;
		}
	}
	@Override
	public void clear() {
		size = 0 ;
		head = tail = null ;
	}

	@Override
	public boolean contains(E e) {
		boolean result = false;
		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			if(current.equals(e)){
				result = true;
				break;
			}
			current = current.next;
		}
		return result;
	}

	@Override
	public E get(int index) {
		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return (E) current;
	}

	@Override/**Return -1 if not match.*/
	public int indexOf(E e) {
		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			if(current.equals(e)){
				return i;
			}
			current = current.next;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(E e) {
		Node<E> current = tail;
		for (int i = size-1; i >= 0; i--) {
			if(current.equals(e)){
				return i;
			}
			current = current.next;
		}
		return -1;
	}

	@Override
	public E remove(int index) {
		if (index < 0 || index >= size) {
			return null;
		}else if (index == 0) {
			return removeFirst();
		}else if (index == size - 1) {
			return removeLast();
		}else{
			Node<E> previous = head;
			for (int i = 0; i < index - 1; i++) {
				previous = previous.next;
			}
			
			Node<E> current = previous.next;
			previous.next = current.next;
			size--;
			return current.element;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		
		Node<E> current = head;
		
		for (int i = 0; i < size; i++) {
			result.append(current.element);
			current = current.next;
			if (current != null) {
				result.append(",");
			}
		}
		return result.toString()+"](链表)";
	}
	
	@Override
	public E set(int index, E e) {
		Node<E> current = new Node<E>(e);
		Node<E> previous = head;
		if (index < 0 || index > size -1) {
			return null;
		}else{
			for (int i = 0; i < index; i++) {
				previous.next = previous;
			}
			E e1 = previous.element;
			previous.element = current.element;
			return e1;
		}
		
	}

	@Override
	public Iterator<E> iterator() {
		
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator<E>{
		
		private Node<E> current = head;
		
		@Override
		public boolean hasNext() {
			return (current != null);
		}

		@Override
		public E next() {
			E e = current.element;
			current = current.next;
			return e;
		}

		@Override
		public void remove() {
			MyLinkedList.this.remove(indexOf(current.element));
		}
		
	}
}

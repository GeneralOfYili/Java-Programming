package org.chapter25.base;

import java.util.Iterator;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
   
	protected TreeNode<E> root;
	protected int size = 0;
	
	/*Creat a default binary tree*/
	public BST() {
	}
	
	@Override/*Return true is the element is in the tree*/
	public boolean search(E e) {

	
		return false;
	}

	

	@Override
	public boolean insert(E e) {
		return false;
	}

	@Override
	public boolean delete(E e) {
		return false;
	}

	@Override
	public int getSize() {
		return 0;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

}

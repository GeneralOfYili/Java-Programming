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
		TreeNode<E> current = root;//Start from root
		
		while (current != null) {
			if (e.compareTo(current.element)<0) {
				current = current.left;
			}else if(e.compareTo(current.element)>0){
				current = current.right;
			}else return true;
		}
		return false;
	}

	@Override/*Insert element e into the binary search tree.
	           return true if the element is inserted successfully*/
	public boolean insert(E e) {
		if (root == null) {
			root = createNewNode(e); //Create a new root
		}else {
			//locate the parent node
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while (current != null) {
				if (e.compareTo(current.element) < 0) {
					parent = current;
					current = current.left;
				}else if(e.compareTo(current.element) > 0) {
					parent = current;
					current = current.right;
				}else return false;//Duplicate node not inserted
			}
			//Create the new node and attach it to the parent node
			if(e.compareTo(parent.element) < 0) {
				parent.left =createNewNode(e);
			}else {
				parent.right =createNewNode(e);
			}
		}
		size ++ ;
		return true;
	}
	private TreeNode<E> createNewNode(E e) {
		return new TreeNode<>(e);
	}
	
	@Override/*Inorder traversal from the root*/
	public void inorder() {
		inorder(root);
	}

	private void inorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.element+" ");
		inorder(root.right);
	}

	@Override/*postorder traversal from the root*/
	public void postorder() {
		postorder(root);
	}

	private void postorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		inorder(root.right);
		System.out.println(root.element+" ");
	}

	@Override/*preeorder traversal from the root*/
	public void preeorder() {
		preeorder(root);
	}

	private void preeorder(TreeNode<E> root2) {
		if (root == null) {
			return;
		}
		System.out.println(root.element+" ");
		inorder(root.left);
		inorder(root.right);
	}
	/*inner class*/
	public static class TreeNode<E extends Comparable<E>> {
		protected E element;
		protected TreeNode<E> left;
		protected TreeNode<E> right;
		
		public TreeNode(E element) {
			this.element = element;
		}
	}

	@Override
	public int getSize() {
		return size;
	}
	
	/**Returens the root from the tree*/
	public TreeNode<E> getRoot(){
		return root;
	}
	
	@Override
	public boolean delete(E e) {
		return false;
	}


	@Override
	public Iterator<E> iterator() {
		return null;
	}

}

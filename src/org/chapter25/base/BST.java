package org.chapter25.base;

import java.util.ArrayList;
import java.util.Iterator;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
   
	protected TreeNode<E> root;
	public int size = 0;
	
	/**Creat a default binary tree*/
	public BST() {
	}
	/**Creat a default binary tree from an array of objects*/
	public BST(E[] objects) {
		for (int i = 0; i < objects.length; i++) {
			insert(objects[i]);
		}
	}
	@Override/**Return true is the element is in the tree*/
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

	@Override/**Insert element e into the binary search tree.
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
	
	@Override/**Inorder traversal from the root*/
	public void inorder() {
		inorder(root);
	}

	private void inorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.element+" ");
		inorder(root.right);
	}

	@Override/**postorder traversal from the root*/
	public void postorder() {
		postorder(root);
	}

	private void postorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.element+" ");
	}

	@Override/**preorder traversal from the root*/
	public void preorder() {
		preorder(root);
	}

	private void preorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.element+" ");
		preorder(root.left);
		preorder(root.right);
	}
	/**inner class*/
	public static class TreeNode<E extends Comparable<E>> {
		public E element;
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
	
	/**Returns a path from the root leading to the specified element*/
	public ArrayList<TreeNode<E>> path(E e) {
		ArrayList<TreeNode<E>> list = new ArrayList<TreeNode<E>>();
		TreeNode<E> current = root; // Start from the root
		while (current != null) {
			list.add(current);
			if (e.compareTo(current.element) < 0) {
				current = current.left;
			}else if(e.compareTo(current.element) > 0) {
				current = current.right;
			}else break;
		}
		return list;
	}
	
	@Override/**Delete an element from the binary search tree.
	 		   *Return true if the element is deleted successfully
	 		   *Return false if the element is not in the tree*/
	public boolean delete(E e) {
		// Locate the node to be deleted and also locate its parent node
		TreeNode<E> parent = null;
		TreeNode<E> current = root; // Start from the root
		while (current != null) {
			if (e.compareTo(current.element) < 0) {
				parent = current;
				current = current.left;
			}else if(e.compareTo(current.element) > 0) {
				parent = current;
				current = current.right;
			}else break; // Element is in the tree pointed at by current
		}
		
		if(current == null) {
			return false; // Element is not in the tree
			}
		// Case 1: current has no left child
		if (current.left == null) {
			if(parent == null) {
				root = current.right;
			}else { // Reconnect parent
				if (e.compareTo(parent.element) < 0) {
					parent.left = current.right;
				}else {
					parent.right = current.right;
				}
			}
		}else {
		// Case 2: The current node has a left child
		// Locate the right most node in the left subtree of the current node and also its parent.
			TreeNode<E> parentOfRightMost = current;
			TreeNode<E> rightMost = current.left;
			
			// Keep going to ghe right
			while (rightMost.right != null) {
				parentOfRightMost = rightMost;
				rightMost = rightMost.right;
			}
			
			//Replace the element in current by the element in rightMost
			current.element = rightMost.element;
			
			// Eliminate rightmost node
			if (parentOfRightMost.right == rightMost) {
				parentOfRightMost.right = rightMost.left;
			}else {
				parentOfRightMost.left = rightMost.left;
			}
		}
		size--;
		return false;
	}


	@Override/**Obtain an iterator.Use inorder.*/
	public Iterator<E> iterator() {
		return new InorderIterator();
	}
	
	/**Inner class InorderIterator*/
	private class InorderIterator implements Iterator<E>{
		
		// Store the elements in a list
		private ArrayList<E> list = new ArrayList<E>();
		// Point to the current element in list
		private int current = 0;
		
		
		public InorderIterator() {
			inorder(); // Traverse binary tree and store elements in list
		}
		
		/**Inorder traversal from the root*/
		private void inorder() {
			inorder(root);
		}
		/**Inorder traversal from the subtree*/
		private void inorder(TreeNode<E> root) {
			if (root == null) {
				return;
			}
			inorder(root.left);
			list.add(root.element);
			inorder(root.right);
		}

		@Override
		public boolean hasNext() {
			if (current < list.size()) {
				return true;
			}
			return false;
		}

		@Override
		public E next() {
			return list.get(current++);
		}

		@Override/** Remove the current element*/
		public void remove() {
			delete(list.get(current));
			list.clear();
			inorder();//Rebuild the list
		}
	}
	
	/** Remove all element from the tree*/
	public void clear() {
		root = null;
		size = 0;
	}
}

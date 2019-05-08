package org.chapter25.base;

import java.util.ArrayList;

import org.chapter25.base.BST.TreeNode;

public class TestBST {
	public static void main(String[] args) {
		// Create a BST
		BST<String> tree = new BST<>();
		tree.insert("George"); // 乔治
		tree.insert("Michael"); // 迈克尔
		tree.insert("Tom"); // 汤姆
		tree.insert("Adam"); // 亚当
		tree.insert("Jones"); // 琼斯
		tree.insert("Peter"); // 彼得
		tree.insert("Daniel"); // 丹尼尔
		
		//Traverse tree
		System.out.println("Inorder(sorted): ");
		tree.inorder();
		
		System.out.println("\nPostorder: ");
		tree.postorder();
		
		System.out.println("\nPreeorder: ");
		tree.preorder();
		
		// Search for a element
		System.out.println("\nIs Peter in the tree ? "+tree.search("Peter"));
		
		// Size
		System.out.println("\nTree size equals "+tree.size);
		
		// Get path
		ArrayList<TreeNode<String>> path = tree.path("Peter");
		for (TreeNode<String> treeNode : path) {
			System.out.print(treeNode.element+" ");
		}
		
		//Integer tree
		Integer[] numbers = {2,4,3,1,8,5,6,7};
		BST<Integer> intTree = new BST<>(numbers);
		System.out.println();
		intTree.inorder();
		
	}
}

package org.chapter25.base;

public interface Tree<E> extends Iterable<E> {
	
	public boolean search(E e);
	
	public boolean insert(E e);
	
	public boolean delete(E e);
	
	//中序
	public void inorder();
	
	//后序
	public void postorder();
	
	//前序
	public void preorder();
	
	public int getSize();
	
	public boolean isEmpty();

	
}

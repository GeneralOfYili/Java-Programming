package org.chapter24.base;

public abstract class MyAbstractList<E> implements MyList<E> {
	
	public int size = 0 ;
	
	/**Create a default list*/
	protected MyAbstractList() {
	}
	
	/**Create a list from an array of objects*/
	protected MyAbstractList(E[] objects){
		for (int i = 0; i < objects.length; i++) {
			add(objects[i]);
		}
	}
	
	@Override
	public void add(E e) {
		add(size,e);
	}

	@Override
	public boolean ifEmpty() {
		return size == 0;
	}


	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean remove(E e) {
		if(indexOf(e)>=0){
			remove(indexOf(e));
			return true;
		}else{
		return false;
		}
	}
	

}

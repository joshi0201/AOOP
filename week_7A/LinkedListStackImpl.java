package week_7A;

import java.util.LinkedList;

public class LinkedListStackImpl<T> implements Stackable<T> {
	    private LinkedList<T> list;

	    public LinkedListStackImpl() {
	        list = new LinkedList<>();
	    }

	    @Override
	    public void pushItem(T item) {
	        list.addFirst(item);
	        System.out.println("Item pushed: " + item);
	    }

	    @Override
	    public T popItem() {
	        if (isStackEmpty()) {
	            System.out.println("No items to pop. Stack is empty.");
	            return null;
	        }
	        T item = list.removeFirst();
	        System.out.println("Item popped: " + item);
	        return item;
	    }

	    @Override
	    public T peekItem() {
	        if (isStackEmpty()) {
	            System.out.println("Stack is empty. No top item.");
	            return null;
	        }
	        T item = list.getFirst();
	        System.out.println("Top item: " + item);
	        return item;
	    }

	    @Override
	    public boolean isStackEmpty() {
	        return list.isEmpty();
	    }
	}
	
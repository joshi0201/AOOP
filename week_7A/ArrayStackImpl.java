package week_7A;
import java.util.Arrays;
public class ArrayStackImpl<T> implements Stackable<T> {
	    private Object[] array;
	    private int size;
	    private static final int INITIAL_CAPACITY = 20;

	    public ArrayStackImpl() {
	        array = new Object[INITIAL_CAPACITY];
	        size = 0;
	    }

	    @Override
	    public void pushItem(T item) {
	        if (size == array.length) {
	            array = Arrays.copyOf(array, array.length * 2);
	        }
	        array[size++] = item;
	        System.out.println("Pushed item: " + item);
	    }

	    @Override
	    public T popItem() {
	        if (isStackEmpty()) {
	            System.out.println("Stack is empty. Cannot pop.");
	            return null;
	        }
	        T item = (T) array[--size];
	        array[size] = null;
	        System.out.println("Popped item: " + item);
	        return item;
	    }

	    @Override
	    public T peekItem() {
	        if (isStackEmpty()) {
	            System.out.println("Stack is empty.");
	            return null;
	        }
	        T item = (T) array[size - 1];
	        System.out.println("Current top item: " + item);
	        return item;
	    }

	    @Override
	    public boolean isStackEmpty() {
	        return size == 0;
	    }
	}


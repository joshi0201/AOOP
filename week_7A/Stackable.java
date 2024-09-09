package week_7A;

public interface Stackable<T> {
	    void pushItem(T item);
	    T popItem();
	    T peekItem();
	    boolean isStackEmpty();
	}

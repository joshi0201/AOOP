package week_7B;

import java.util.PriorityQueue;

public class GenericPriorityQueueChar<T extends Comparable<T>> {

	    private PriorityQueue<T> queue;

	    // Constructor
	    public GenericPriorityQueueChar() {
	        queue = new PriorityQueue<>();
	    }

	    public void enqueue(T element) {
	        queue.offer(element);
	        System.out.println("Enqueued: " + element);
	    }

	    public T dequeue() {
	        T element = queue.poll();
	        if (element != null) {
	            System.out.println("Dequeued: " + element);
	        } else {
	            System.out.println("Queue is empty!");
	        }
	        return element;
	    }

	    public void displayQueue() {
	        System.out.println("Current queue: " + queue);
	    }
}

package week_7B;

public class main {
	  public static void main(String[] args) {
	        // Test with Characters
	        System.out.println("\nTesting with Character data type:");
	        GenericPriorityQueueChar<Character> charQueue = new GenericPriorityQueueChar<>();
	        charQueue.enqueue('C');
	        charQueue.enqueue('A');
	        charQueue.enqueue('B');
	        charQueue.displayQueue();
	        charQueue.dequeue();
	        charQueue.displayQueue();
	    }
	}



package week10;

	public class Main {
		public static void main(String[] args) {
	        // Create a shared buffer
	        SharedBuffer buffer = new SharedBuffer();

	        // Create Producer and Consumer threads
	        Thread producerThread = new Thread(new Producer(buffer));
	        Thread consumerThread = new Thread(new Consumer(buffer));

	        // Start the producer and consumer threads
	        producerThread.start();
	        consumerThread.start();

	        // Wait for threads to finish
	        try {
	            producerThread.join();
	            consumerThread.join();
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted.");
	        }

	        System.out.println("Messaging application finished.");
	    }
	}

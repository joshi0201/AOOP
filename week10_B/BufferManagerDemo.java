package week10B;

	public class BufferManagerDemo {
	    public static void main(String[] args) {
	        BufferManager buffer = new BufferManager();

	        Thread producerThread = new Thread(new NumberProducer(buffer));
	        Thread consumerThread = new Thread(new NumberConsumer(buffer));

	        producerThread.start();
	        consumerThread.start();
	    }
	}


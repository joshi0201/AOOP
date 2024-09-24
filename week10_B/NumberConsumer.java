package week10B;

	public class NumberConsumer implements Runnable {
	    private final BufferManager buffer;
	    private final int MAX_VALUES = 15;  // Limit for values consumed

	    public NumberConsumer(BufferManager buffer) {
	        this.buffer = buffer;
	    }

	    @Override
	    public void run() {
	        int count = 0;
	        try {
	            while (count < MAX_VALUES) {
	                buffer.retrieve();
	                count++;
	                Thread.sleep(700);  // Simulate consumption delay
	            }
	            System.out.println("NumberConsumer finished retrieving values.");
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}


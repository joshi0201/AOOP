package week10B;

	public class NumberProducer implements Runnable {
	    private final BufferManager buffer;
	    private final int MAX_VALUES = 15;  // Limit for values produced

	    public NumberProducer(BufferManager buffer) {
	        this.buffer = buffer;
	    }

	    @Override
	    public void run() {
	        int value = 0;
	        try {
	            while (value < MAX_VALUES) {
	                buffer.store((double) value++);
	                Thread.sleep(300);  // Simulate production delay
	            }
	            System.out.println("NumberProducer finished storing values.");
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}


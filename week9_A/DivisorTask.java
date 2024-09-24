package week9A;

	public class DivisorTask implements Runnable {
	    private final SharedNumber sharedNumber;
	    private final int divisor;
	    private final String message;

	    public DivisorTask(SharedNumber sharedNumber, int divisor, String message) {
	        this.sharedNumber = sharedNumber;
	        this.divisor = divisor;
	        this.message = message;
	    }

	    @Override
	    public void run() {
	        while (!sharedNumber.isMaxReached()) {
	            synchronized (sharedNumber) {
	                int current = sharedNumber.getNumber();
	                if (current % divisor == 0) {
	                    System.out.println(message + current);
	                    sharedNumber.incrementNumber();
	                }
	            }
	        }
	    }
	}


package week9A;

	public class GeneralTask implements Runnable {
	    private final SharedNumber sharedNumber;

	    public GeneralTask(SharedNumber sharedNumber) {
	        this.sharedNumber = sharedNumber;
	    }

	    @Override
	    public void run() {
	        while (!sharedNumber.isMaxReached()) {
	            synchronized (sharedNumber) {
	                int current = sharedNumber.getNumber();
	                if (current % 2 != 0 && current % 3 != 0 && current % 4 != 0 && current % 5 != 0) {
	                    System.out.println("Number: " + current);
	                    sharedNumber.incrementNumber();
	                }
	            }
	        }
	    }

}

package week9A;

public class App {
	 public static void main(String[] args) {
	        SharedNumber sharedNumber = new SharedNumber();

	        Thread divisibleByTwoThread = new Thread(new DivisorTask(sharedNumber, 2, "Divisible by 2: "));
	        Thread divisibleByThreeThread = new Thread(new DivisorTask(sharedNumber, 3, "Divisible by 3: "));
	        Thread divisibleByFourThread = new Thread(new DivisorTask(sharedNumber, 4, "Divisible by 4: "));
	        Thread divisibleByFiveThread = new Thread(new DivisorTask(sharedNumber, 5, "Divisible by 5: "));
	        Thread generalNumberThread = new Thread(new GeneralTask(sharedNumber));

	        divisibleByTwoThread.start();
	        divisibleByThreeThread.start();
	        divisibleByFourThread.start();
	        divisibleByFiveThread.start();
	        generalNumberThread.start();
	    }
	}


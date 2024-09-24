package week9A;

public class SharedNumber {
	private int number = 1;
    private final int MAX_LIMIT = 15;

    public synchronized int getNumber() {
        return number;
    }

    public synchronized void incrementNumber() {
        number++;
    }

    public boolean isMaxReached() {
        return number > MAX_LIMIT;
    }
}

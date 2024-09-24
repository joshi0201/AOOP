package week10B;
import java.util.LinkedList;
import java.util.Queue;

public class BufferManager {
    private final Queue<Double> buffer = new LinkedList<>();
    private final int CAPACITY = 3;

    // Producer method
    public synchronized void store(double value) throws InterruptedException {
        while (buffer.size() == CAPACITY) {
            System.out.println("Buffer is full. Store operation waiting...");
            wait();  // Wait for space
        }

        buffer.add(value);
        System.out.println("Stored: " + value);
        notifyAll();  // Notify consumers
    }
    public synchronized double retrieve() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Retrieve operation waiting...");
            wait();  // Wait for data
        }

        double value = buffer.poll();
        System.out.println("Retrieved: " + value);
        notifyAll();  // Notify producers
        return value;
    }
}


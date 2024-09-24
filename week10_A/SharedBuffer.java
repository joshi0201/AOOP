package week10;
import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    // Buffer to store messages
    private Queue<String> messageQueue = new LinkedList<>();

    // Synchronized method to add a message to the buffer
    public synchronized void addMessage(String message) {
        System.out.println("Adding message to buffer: " + message);
        messageQueue.add(message); // Actually adding the message to the queue
        notify(); // Notify any waiting threads (Consumer) that a message has been added
    }

    // Synchronized method to retrieve a message from the buffer
    public synchronized String getMessage() throws InterruptedException {
        while (messageQueue.isEmpty()) {
            wait(); // Wait until a message is available
        }
        return messageQueue.poll(); // Remove and return the head of the queue
    }

    // Method to check if the buffer is empty
    public synchronized boolean isEmpty() {
        return messageQueue.isEmpty();
    }
}




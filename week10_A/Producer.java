package week10;

class Producer implements Runnable {
    private SharedBuffer sharedBuffer;
    private String[] messages = {"Message 1", "Message 2", "Message 3", "DONE"}; // Add a DONE message

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
        System.out.println("Producer created.");
    }

    @Override
    public void run() {
        for (String message : messages) {
            System.out.println("Producer generating message: " + message);
            sharedBuffer.addMessage(message);
            try {
                // Simulate delay
                Thread.sleep(1000);
                System.out.println("Producer sleeping...");
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted.");
            }
        }
        System.out.println("Producer finished generating messages.");
    }
}

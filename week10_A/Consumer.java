package week10;

class Consumer implements Runnable {
    private SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
        System.out.println("Consumer created.");
    }

    @Override
    public void run() {
        while (true) {
            try {
                String message = sharedBuffer.getMessage();
                if (message.equals("DONE")) {
                    System.out.println("Consumer received DONE signal. Stopping...");
                    break; // Exit the loop when the DONE message is received
                }
                System.out.println("Consumer consuming message: " + message);
                // Simulate delay
                Thread.sleep(1000);
                System.out.println("Consumer sleeping...");
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted.");
            }
        }
    }
}

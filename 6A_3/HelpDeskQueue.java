package six_a3;

	import java.util.LinkedList;
	import java.util.Queue;
public class HelpDeskQueue {
	    private Queue<SupportTicket> supportQueue;

	    public HelpDeskQueue() {
	        supportQueue = new LinkedList<>();
	    }

	    // Add a new support request to the queue
	    public void addRequest(String clientName, String requestDetails) {
	        supportQueue.add(new SupportTicket(clientName, requestDetails));
	        System.out.println("Support request added for client: " + clientName);
	    }

	    // Handle the next support request in the queue
	    public void handleNextRequest() {
	        SupportTicket ticket = supportQueue.poll();
	        if (ticket != null) {
	            System.out.println("Handling request: " + ticket);
	        } else {
	            System.out.println("No requests to handle.");
	        }
	    }

	    // Show all pending support requests in the queue
	    public void showAllRequests() {
	        if (supportQueue.isEmpty()) {
	            System.out.println("No pending requests.");
	        } else {
	            System.out.println("Pending support requests:");
	            for (SupportTicket ticket : supportQueue) {
	                System.out.println(ticket);
	            }
	        }
	    }
	}

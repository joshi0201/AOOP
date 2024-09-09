package six_a3;

public class SupportTicket {
	private String clientName;
    private String requestDetails;

    public SupportTicket(String clientName, String requestDetails) {
        this.clientName = clientName;
        this.requestDetails = requestDetails;
    }

    public String getClientName() {
        return clientName;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    @Override
    public String toString() {
        return "Client: " + clientName + ", Request: " + requestDetails;
    }
}


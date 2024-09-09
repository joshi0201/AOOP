package six_a2;

public class Job {
	    private String details;

	    public Job(String details) {
	        this.details = details;
	    }

	    public String getDetails() {
	        return details;
	    }

	    public void setDetails(String details) {
	        this.details = details;
	    }

	    @Override
	    public String toString() {
	        return details;
	    }
	}

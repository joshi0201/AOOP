package FourA;

	public class Participant implements Listener {
	    private String participantName;

	    public Participant(String participantName) {
	        this.participantName = participantName;
	    }

	    @Override
	    public void onUpdate(String event) {
	        System.out.println("Participant " + participantName + " received notification: " + event);
	    }
	}



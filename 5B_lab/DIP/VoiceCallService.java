package dip;

	public class VoiceCallService implements NotificationService {
	    @Override
	    public void notify(String message) {
	        System.out.println("Voice Call made: " + message);
	    }
	}


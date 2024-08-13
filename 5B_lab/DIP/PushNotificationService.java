package dip;

	public class PushNotificationService implements NotificationService {
	    @Override
	    public void notify(String message) {
	        System.out.println("Push Notification sent: " + message);
	    }
	}


package dip;

public class NotificationApp {
	private NotificationService service;

    public NotificationApp(NotificationService service) {
        this.service = service;
    }

    public void handleMessages(String message) {
        service.notify(message);
    }
    public static void main(String[] args) {
        NotificationService pushService = new PushNotificationService();
        NotificationApp app = new NotificationApp(pushService);
        app.handleMessages("Reminder via Push Notification");

        NotificationService callService = new VoiceCallService();
        app = new NotificationApp(callService);
        app.handleMessages("Reminder via Voice Call");
    }
}


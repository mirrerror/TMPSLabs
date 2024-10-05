package md.mirrerror;

public class PushNotificationSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }

}
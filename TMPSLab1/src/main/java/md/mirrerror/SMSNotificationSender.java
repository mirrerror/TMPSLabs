package md.mirrerror;

public class SMSNotificationSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification: " + message);
    }

}
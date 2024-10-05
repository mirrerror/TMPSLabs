package md.mirrerror;

public class EmailNotificationSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Sending email notification: " + message);
    }

}
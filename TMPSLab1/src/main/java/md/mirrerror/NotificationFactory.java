package md.mirrerror;

public class NotificationFactory {

    public static NotificationSender createSender(NotificationType type) {
        switch (type) {
            case EMAIL:
                return new EmailNotificationSender();
            case SMS:
                return new SMSNotificationSender();
            case PUSH:
                return new PushNotificationSender();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }

}
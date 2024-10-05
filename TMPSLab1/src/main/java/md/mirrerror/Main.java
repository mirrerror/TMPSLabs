package md.mirrerror;

public class Main {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        notificationService.addNotificationSender(NotificationFactory.createSender(NotificationType.EMAIL));
        notificationService.addNotificationSender(NotificationFactory.createSender(NotificationType.SMS));
        notificationService.addNotificationSender(NotificationFactory.createSender(NotificationType.PUSH));

        notificationService.notifyAll("Hello, this is a test notification!");
    }

}
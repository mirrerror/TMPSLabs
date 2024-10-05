package md.mirrerror;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<NotificationSender> notificationSenders = new ArrayList<>();

    public void addNotificationSender(NotificationSender sender) {
        notificationSenders.add(sender);
    }

    public void notifyAll(String message) {
        for (NotificationSender sender : notificationSenders) {
            sender.send(message);
        }
    }

}


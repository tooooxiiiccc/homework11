package Notify;


import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        NotificationManager<Notification> notificationManager = new NotificationManager<>();
        notificationManager.add(new EmailNotification("danek.pirozhok", "Здрасьте"));
        notificationManager.add(new SmsNotification("78923457645", "Pizdec"));
        notificationManager.add(new EmailNotification("danek.pirozhok", "Dosvidaniya"));
        EmailNotification emailNotification = new EmailNotification("String", "String");
        notificationManager.add(emailNotification);

        try {
            notificationManager.add(emailNotification);
        } catch (DuplicateIdException d) {
            System.out.println(d.getMessage());
        }

        List<Notification> highPriority = notificationManager.get(Priority.HIGH);
        System.out.println(notificationManager.get(Priority.HIGH));
        for (Notification notification : highPriority) {
            System.out.println(notification);
        }

        Optional<Notification> notificationFound = notificationManager.find(3);

        notificationManager.sendAll();
    }
    }
package org.patterns.creational.FactoryMethod;

public class NotificationService {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new WindowsNotification();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}

package org.patterns.creational.FactoryMethod;

public class WindowsNotification extends NotificationFactory{
//    @Override
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}

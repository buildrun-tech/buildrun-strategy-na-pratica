package tech.buildrun.strategy.service;

public interface NotificationStrategy {

    void sendNotification(String destination, String message);
}

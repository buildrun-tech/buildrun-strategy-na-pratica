package tech.buildrun.strategy.service.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.buildrun.strategy.service.NotificationStrategy;

public class TwitterNotificationStrategy implements NotificationStrategy {
    private final Logger logger = LoggerFactory.getLogger(TwitterNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Notificacao [{}] enviada para o Twitter [{}]", message, destination);
    }
}

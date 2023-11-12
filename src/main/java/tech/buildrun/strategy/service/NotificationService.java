package tech.buildrun.strategy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import tech.buildrun.strategy.service.strategy.*;

import java.util.Map;

@Service
public class NotificationService {

    private final Map<String, NotificationStrategy> mapStrategy = Map.of(
        "discord", new DiscordNotificationStrategy(),
        "instagram", new InstagramNotificationStrategy(),
        "twitter", new TwitterNotificationStrategy(),
        "email", new EmailNotificationStrategy(),
        "whatsapp", new WhatsappNotificationStrategy()
    );
    private final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void notify(String channel, String destination, String message) {

        mapStrategy.get(channel).sendNotification(destination, message);
    }
}

package tech.buildrun.strategy.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.buildrun.strategy.service.NotificationService;

@RestController
@RequestMapping("/v1/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody @Valid NotificationRequest request) {
        notificationService.notify(
                request.channel(),
                request.destination(),
                request.message()
        );

        return ResponseEntity.accepted().build();
    }
}

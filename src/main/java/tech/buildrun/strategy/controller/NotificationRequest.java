package tech.buildrun.strategy.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;


public record NotificationRequest(
        @NotBlank
        String channel,
        @NotBlank
        String destination,
        @NotBlank
        String message
) {
}

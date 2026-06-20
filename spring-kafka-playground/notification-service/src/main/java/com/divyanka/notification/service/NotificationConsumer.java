package com.divyanka.notification.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(
            topics = "orders",
            groupId = "notification-group")
    public void consume(String message) {

        System.out.println(
            "Welcome Email Sent : " + message
        );
    }
} 
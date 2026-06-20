package com.divyanka.payment.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "payments", groupId = "payment-group")
    public void consume(String message) {
        System.out.println("Payment Successful for : " + message);
    }
}
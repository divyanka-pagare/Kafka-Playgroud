package com.divyanka.inventory.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private final KafkaProducerService kafkaProducerService;

    public KafkaConsumerService(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @KafkaListener(topics = "orders", groupId = "inventory-group")
    public void consume(String message) {
        System.out.println("Inventory Reserved for : " + message);
        kafkaProducerService.sendToPayment(message);
    }
}
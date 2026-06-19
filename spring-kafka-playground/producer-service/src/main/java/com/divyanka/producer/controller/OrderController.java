package com.divyanka.producer.controller;

import com.divyanka.producer.service.KafkaProducerService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final KafkaProducerService kafkaProducerService;
    public OrderController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping
    public String createOrder(@RequestBody String order) {
        kafkaProducerService.sendOrder(order);
        return "Order send to Kafka successully";
    }
}
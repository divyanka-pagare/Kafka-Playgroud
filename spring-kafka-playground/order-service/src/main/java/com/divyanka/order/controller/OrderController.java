package com.divyanka.order.controller;

import com.divyanka.order.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final KafkaProducerService kafkaProducerService;

    public OrderController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping
    public String sendOrder(@RequestBody String order) {
        kafkaProducerService.sendMessage(order);
        return "Order Sent Successfully";
    }
}
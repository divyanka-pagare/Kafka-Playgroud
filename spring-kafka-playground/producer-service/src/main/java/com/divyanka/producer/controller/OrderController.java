package com.divyanka.producer.controller;

import com.divyanka.producer.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;


// import com.divyanka.producer.service.KafkaProducerService;

// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/orders")
public class OrderController {

    private final KafkaProducerService producerService;

    public OrderController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public String sendOrder(@RequestBody String order) {

        producerService.sendMessage(order);

        return "Order Sent Successfully";
    }
}
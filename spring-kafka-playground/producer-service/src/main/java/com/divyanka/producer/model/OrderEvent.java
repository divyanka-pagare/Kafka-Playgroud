package com.divyanka.producer.model;

public record OrderEvent(
    String orderId,
    String customerId,
    Double amount
) {
    
}